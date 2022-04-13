package legym.fuck.logic.clouds

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import legym.fuck.logic.clouds.service.CloudConfigService


/**
 * @author ldh
 * 时间: 2022/3/19 8:48
 *
 */
object CloudsNetworkRepository {

    private val cloudConfigService by lazy { CloudsServiceCreator.create<CloudConfigService>() }

    suspend fun getStopConfig() = catchError { cloudConfigService.getStopConfig() }

    suspend fun getNotices() = catchError { cloudConfigService.getNotices() }

    suspend fun getUploadLogCinfig() = catchError { cloudConfigService.getUploadLogCinfig() }

    suspend fun getAppOLConfig() = catchError { cloudConfigService.getAppOLConfig() }

    suspend fun getDocs() = catchError { cloudConfigService.getDocs() }

    suspend fun getMaps() = catchError { cloudConfigService.getMaps() }


    private suspend fun <T> catchError(block: suspend () -> T?): T? = run {
        try {
            withContext(Dispatchers.IO) { block() }
        } catch (e: Exception) {
            Log.e("请求异常", e.toString())
            null
        }

    }

}