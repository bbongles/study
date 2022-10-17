package ch13.domain.userinfo.dao.oracle;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

// UserInfoDao 인터페이스를 구현한 Oracle 버전 dao
public class UserInfoOracleDao implements UserInfoDao {

	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into ORACLE DB userId =" + userInfo.getUserId());
	}

	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into ORACLE DB userId = " + userInfo.getUserId());
	}

	public void deleteUserInf(UserInfo userInfo) {
		System.out.println("delete from ORACLE DB userId = " + userInfo.getUserId());
	}
	
} // end class UserInfoOracleDao
