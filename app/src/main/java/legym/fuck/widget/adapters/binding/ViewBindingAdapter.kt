package legym.fuck.widget.adapters.binding

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import legym.fuck.R
import com.bumptech.glide.Glide
import com.liangguo.androidkit.app.clipRoundCorner
import com.liangguo.androidkit.app.dp2px
import legym.fuck.logic.legym.network.model.login.LoginResult


/**
 * @author ldh
 * 时间: 2022/2/5 18:25
 *
 */

object ViewBindingAdapter {

    /**
     * View切割圆角，单位是dp
     */
    @JvmStatic
    @BindingAdapter("clipRoundCorner")
    fun View.clipRoundCornerDp(dp: Float) {
        clipRoundCorner(dp.dp2px)
    }

    /**
     * 加载乐健的头像
     */
    @JvmStatic
    @BindingAdapter("setLegymHeader")
    fun ImageView.setLegymHeader(user: LoginResult?) {
        user?.let {
            Glide.with(this)
                .load((user.avatar ?: ""))
                .placeholder(
                    if (user.gender != 1) R.drawable.ic_avatar_male
                    else R.drawable.icon_avatar_man
                )
                .into(this)
        } ?: setImageResource(R.drawable.icon_avatar_man)
    }

}
