/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.sql.SQLException;

/**
 * ��һ������ݿⶼ�Թ������������ˣ�����û�и��������Դ�ˣ��׳��ô���
 * 
 * @author linxuan
 * 
 */
public class NoMoreDataSourceException extends SQLException {

	private static final long serialVersionUID = 1L;

	public NoMoreDataSourceException(String reason) {
		super(reason);
	}
}