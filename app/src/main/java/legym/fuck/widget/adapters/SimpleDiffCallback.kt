package legym.fuck.widget.adapters

import androidx.recyclerview.widget.DiffUtil

/**
 * 作为[DiffUtil.Callback]的实现类。
 * 这个类是最简单的一个实现，判断两个实体一样不一样仅仅是调用他们的equals来判断。
 */
class SimpleDiffCallback(
    private val mOldList: MutableList<out Any>,
    private val mNewList: MutableList<out Any>
) : DiffUtil.Callback() {

    override fun getOldListSize() = mOldList.size

    override fun getNewListSize() = mNewList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        mOldList[oldItemPosition] == mNewList[newItemPosition]

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        mOldList[oldItemPosition] == mNewList[newItemPosition]

}
