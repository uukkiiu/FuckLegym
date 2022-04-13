package legym.fuck.ui.runhistory

import android.os.Bundle
import androidx.activity.viewModels
import legym.fuck.databinding.ActivityRunningHistoryBinding
import legym.fuck.base.CollapsingToolbarActivity


/**
 * @author ldh
 * 时间: 2022/3/20 21:58
 *
 */
class RunningHistoryActivity : CollapsingToolbarActivity() {

    private val mDataBinding by lazy {
        ActivityRunningHistoryBinding.inflate(layoutInflater, contentViewContainer, true)
    }

    private val mViewModel by viewModels<RunningHistoryViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDataBinding.recyclerView.adapter = mViewModel.historyAdapter
        mDataBinding.refreshLayout.setOnRefreshListener {
            mViewModel.loadHistoryData()
        }
        initDataListeners()
    }

    private fun initDataListeners() {
        mViewModel.loading.observe(this) {
            if (!it) mDataBinding.refreshLayout.finishRefresh()
        }
    }
}