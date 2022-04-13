package legym.fuck.ui.doc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import br.tiagohm.markdownview.css.styles.Github
import legym.fuck.R
import legym.fuck.databinding.FragmentDocContentBinding


/**
 * @author ldh
 * 时间: 2022/3/21 22:38
 *
 */
class DocContentFragment : Fragment() {

    private lateinit var mDataBinding: FragmentDocContentBinding

    private val mViewModel by activityViewModels<DocViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_doc_content, container, false)
        mDataBinding = DataBindingUtil.bind(view)!!
        mDataBinding.lifecycleOwner = viewLifecycleOwner
        initViews()
        return view
    }

    private fun initViews() {
        mDataBinding.markdownView.apply {
            addStyleSheet(Github())
        }
        mViewModel.currentDoc.observe(viewLifecycleOwner) {
            mDataBinding.markdownView.loadMarkdownFromUrl(it.url)
        }

    }


}