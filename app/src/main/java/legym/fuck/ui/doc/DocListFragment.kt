package legym.fuck.ui.doc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.asLiveData

import com.angcyo.dsladapter.DslAdapter
import com.angcyo.dsladapter.DslAdapterStatusItem
import legym.fuck.R
import legym.fuck.databinding.FragmentDocListBinding
import legym.fuck.logic.OnlineData
import legym.fuck.logic.clouds.model.DocInfo

/**
 * @author ldh
 * 时间: 2022/3/21 22:40
 *
 */
class DocListFragment : Fragment() {

    private lateinit var mDataBinding: FragmentDocListBinding

    private val mViewModel by activityViewModels<DocViewModel>()

    private val mAdapter = DslAdapter()

    private val itemClickListener = { doc: DocInfo ->
        mViewModel.currentDoc.value = doc
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_doc_list, container, false)
        mDataBinding = DataBindingUtil.bind(view)!!
        mDataBinding.lifecycleOwner = viewLifecycleOwner
        initViews()
        initDataListeners()
        return view
    }

    private fun initDataListeners() {
        OnlineData.docInfoList.asLiveData().observe(viewLifecycleOwner) { docs ->
            mAdapter.changeDataItems { adapterItems ->
                adapterItems.clear()
                docs.forEach {
                    adapterItems.add(DocAdapterItem(it, itemClickListener))
                }
            }
            if (docs.isEmpty()) {
                mAdapter.setAdapterStatus(DslAdapterStatusItem.ADAPTER_STATUS_EMPTY)
            }
        }
    }

    private fun initViews() {
        mDataBinding.recyclerView.adapter = mAdapter
    }


}