package com.liangguo.security

import org.bouncycastle.jce.provider.BouncyCastleProvider
import org.bouncycastle.util.encoders.Hex
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.security.InvalidKeyException
import java.security.Key
import java.security.NoSuchAlgorithmException
import java.security.Security
import java.util.*
import java.util.regex.Pattern
import javax.crypto.*
import javax.crypto.spec.SecretKeySpec

class AesUtil {
    var key: Key? = null

    private constructor() {}
    constructor(key: Key?) {
        this.key = key
    }

    constructor(key: String) : this() {
        setKey(key)
    }

    fun setKey(key: String) {
        try {
            this.key = toKeyDES(key.toByteArray(), KEY_AES)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * 对字符串解密
     *
     * @param data 要解密的数据
     * @param key  密钥
     * @return 解密后参数
     */
    @Throws(Exception::class)
    fun decrypt2String(data: String?, key: String): String {
        var data = data
        if (data == null || data.length == 0) {
            throw Exception("输入不能为null或者\"\"  \n  input must not be null or \"\"")
        }
        data = data.trim { it <= ' ' }
        if (!isPlaintext(data)) {
            try {
                val k = toKeyDES(key.toByteArray(), KEY_AES)
                val cipher = Cipher.getInstance(AES_PKCS5, PROVIDER)
                cipher.init(2, k)
                val source = Hex.decode(data)
                return String(cipher.doFinal(source), charset(CHARSET))
            } catch (e: Exception) {
                println("字符串解密异常$e")
            }
        }
        return data
    }

    @Throws(Exception::class)
    fun decrypt2String(data: String?): String {
        var data = data
        if (data == null || data.isEmpty()) {
            throw Exception("输入不能为null或者\"\"  \n  input must not be null or \"\"")
        }
        data = data.trim { it <= ' ' }
        if (!isPlaintext(data)) {
            try {
                val cipher = Cipher.getInstance(AES_PKCS5, PROVIDER)
                cipher.init(2, key)
                val source = Hex.decode(data)
                return String(cipher.doFinal(source), charset(CHARSET))
            } catch (e: Exception) {
                println("字符串解密异常$e")
            }
        }
        return data
    }

    /**
     * 对字符串加密
     *
     * @param data 要加密的数据
     * @param key  密钥
     * @return 加密后的参数
     */
    @Throws(Exception::class)
    fun encrypt2String(data: String?, key: String): String {
        if (data == null || data.length == 0) {
            throw Exception("输入不能为null或者\"\"  \n  input must not be null or \"\"")
        }
        try {
            val plaintext = data.toByteArray(charset(CHARSET))
            val k = toKeyDES(key.toByteArray(), KEY_AES)
            val cipher = Cipher.getInstance(AES_PKCS5, PROVIDER)
            cipher.init(1, k)
            val ciphertext = cipher.doFinal(plaintext, 0, plaintext.size)
            return String(Hex.encode(ciphertext)).uppercase(Locale.getDefault())
        } catch (e: Exception) {
            println("字符串解密异常$e")
        }
        return data
    }

    @Throws(Exception::class)
    fun encrypt2String(data: String?): String {
        if (data == null || data.length == 0) {
            throw Exception("输入不能为null或者\"\"  \n  input must not be null or \"\"")
        }
        try {
            val plaintext = data.toByteArray(charset(CHARSET))
            val cipher = Cipher.getInstance(AES_PKCS5, PROVIDER)
            cipher.init(1, key)
            val ciphertext = cipher.doFinal(plaintext, 0, plaintext.size)
            return String(Hex.encode(ciphertext)).uppercase(Locale.getDefault())
        } catch (e: Exception) {
            println("字符串解密异常$e")
        }
        return data
    }

    fun isEmptyString(str: String?): Boolean {
        return str == null || str.length == 0
    }

    /**
     * 加密
     */
    @Throws(
        InvalidKeyException::class,
        ShortBufferException::class,
        IllegalBlockSizeException::class,
        BadPaddingException::class,
        NoSuchAlgorithmException::class,
        NoSuchPaddingException::class,
        IOException::class
    )
    fun encrypt(`in`: InputStream) {
        this.crypt(`in`, null, Cipher.ENCRYPT_MODE)
    }

    /**
     * 解密
     */
    @Throws(
        InvalidKeyException::class,
        ShortBufferException::class,
        IllegalBlockSizeException::class,
        BadPaddingException::class,
        NoSuchAlgorithmException::class,
        NoSuchPaddingException::class,
        IOException::class
    )
    fun decrypt(`in`: InputStream): String {
        return this.crypt(`in`, Cipher.DECRYPT_MODE)
    }

    /**
     * 加密
     */
    @Throws(
        InvalidKeyException::class,
        ShortBufferException::class,
        IllegalBlockSizeException::class,
        BadPaddingException::class,
        NoSuchAlgorithmException::class,
        NoSuchPaddingException::class,
        IOException::class
    )
    fun encrypt(`in`: InputStream, out: OutputStream?) {
        this.crypt(`in`, out, Cipher.ENCRYPT_MODE)
    }

    /**
     * 解密
     */
    @Throws(
        InvalidKeyException::class,
        ShortBufferException::class,
        IllegalBlockSizeException::class,
        BadPaddingException::class,
        NoSuchAlgorithmException::class,
        NoSuchPaddingException::class,
        IOException::class
    )
    fun decrypt(`in`: InputStream, out: OutputStream?) {
        this.crypt(`in`, out, Cipher.DECRYPT_MODE)
    }

    /**
     * 加密解密成二进制数据流
     *
     * @param in
     * @param mode
     * @return
     * @throws IOException
     * @throws ShortBufferException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     * @throws NoSuchAlgorithmException
     * @throws NoSuchPaddingException
     * @throws InvalidKeyException
     */
    @Throws(
        IOException::class,
        ShortBufferException::class,
        IllegalBlockSizeException::class,
        BadPaddingException::class,
        NoSuchAlgorithmException::class,
        NoSuchPaddingException::class,
        InvalidKeyException::class
    )
    fun crypt2ByteStream(`in`: InputStream, mode: Int): ByteArrayOutputStream {
        val outputStream = ByteArrayOutputStream()
        val cipher = Cipher.getInstance(KEY_AES)
        cipher.init(mode, key)
        val blockSize = BLOCK_SIZE
        val outputSize = cipher.getOutputSize(blockSize)
        val inBytes = ByteArray(blockSize)
        var outBytes: ByteArray? = ByteArray(outputSize)
        var inLength = 0
        var more = true
        while (more) {
            inLength = `in`.read(inBytes)
            if (inLength == blockSize) {
                val outLength = cipher.update(inBytes, 0, blockSize, outBytes)
                outputStream.write(outBytes, 0, outLength)
            } else {
                more = false
            }
        }
        outBytes = if (inLength > 0) //不具有全长度，调用doFinal方法
        {
            cipher.doFinal(inBytes, 0, inLength)
        } else {
            cipher.doFinal()
        }
        outputStream.write(outBytes)
        outputStream.flush()
        return outputStream
    }

    /**
     * 实际的加密解密过程
     */
    @Throws(
        IOException::class,
        ShortBufferException::class,
        IllegalBlockSizeException::class,
        BadPaddingException::class,
        NoSuchAlgorithmException::class,
        NoSuchPaddingException::class,
        InvalidKeyException::class
    )
    fun crypt(`in`: InputStream, out: OutputStream?, mode: Int) {
        val cipher = Cipher.getInstance(KEY_AES)
        cipher.init(mode, key)
        val blockSize = cipher.blockSize
        //        int blockSize = BLOCK_SIZE;
        val outputSize = cipher.getOutputSize(blockSize)
        val inBytes = ByteArray(blockSize)
        var outBytes: ByteArray? = ByteArray(outputSize)
        var inLength = 0
        var more = true
        while (more) {
            inLength = `in`.read(inBytes)
            if (inLength == blockSize) {   //只要输入数据块具有全长度（长度可被8整除），调用update方法
                val outLength = cipher.update(inBytes, 0, blockSize, outBytes)
                out?.write(outBytes, 0, outLength)
            } else {
                more = false
            }
        }
        outBytes = if (inLength > 0) //不具有全长度，调用doFinal方法
        {
            cipher.doFinal(inBytes, 0, inLength)
        } else {
            cipher.doFinal()
        }
        if (out != null) {
            out.write(outBytes)
            out.flush()
        }
    }

    /**
     * 实际的加密解密过程
     */
    @Throws(
        IOException::class,
        ShortBufferException::class,
        IllegalBlockSizeException::class,
        BadPaddingException::class,
        NoSuchAlgorithmException::class,
        NoSuchPaddingException::class,
        InvalidKeyException::class
    )
    fun crypt(`in`: InputStream, mode: Int): String {
        val cipher = Cipher.getInstance(KEY_AES)
        cipher.init(mode, key)
        val blockSize = cipher.blockSize
        //        int blockSize = BLOCK_SIZE;
        val outputSize = cipher.getOutputSize(blockSize)
        val inBytes = ByteArray(blockSize)
        var outBytes: ByteArray? = ByteArray(outputSize)
        var inLength = 0
        var more = true
        val sb = StringBuilder()
        while (more) {
            inLength = `in`.read(inBytes)
            //只要输入数据块具有全长度（长度可被8整除），调用update方法
            if (inLength == blockSize) {
                val outLength = cipher.update(inBytes, 0, blockSize, outBytes)
            } else {
                more = false
            }
        }
        //不具有全长度，调用doFinal方法
        outBytes = if (inLength > 0) {
            cipher.doFinal(inBytes, 0, inLength)
        } else {
            cipher.doFinal()
        }
        sb.append(String(outBytes))
        return sb.toString()
    }

    companion object {
        const val CHARSET = "UTF-8"
        const val KEY_AES = "AES"
        const val AES_PKCS5 = "AES/ECB/PKCS5Padding"
        const val PROVIDER = "BC"
        const val BLOCK_SIZE = 1024
        fun isPlaintext(text: String): Boolean {
            return Pattern.matches("^[0-9xX]*$", text) && text.length < 27
        }

        @Throws(Exception::class)
        fun toKeyDES(key: ByteArray?, algorithm: String?): Key {
            return SecretKeySpec(key, algorithm)
        }

        init {
            try {
                Security.addProvider(BouncyCastleProvider())
            } catch (e: Exception) {
                println(AesUtil::class.java.name + "初始化运算环境失败: " + e)
            }
        }
    }
}