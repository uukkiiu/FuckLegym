package legym.fuck.logic.interfaces;

import legym.fuck.logic.legym.network.model.login.LoginResult;

/**
 * @author ldh
 * 时间: 2022/3/18 14:52
 *
 */
public interface LoginResultCallback {

    void onResult(LoginResult result);

}
