package edu.ycp.cs320.myYorkSpace.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.myYorkSpace.shared.Account;
import edu.ycp.cs320.myYorkSpace.shared.Event;


@RemoteServiceRelativePath("event")
public interface EventServiceAsync {
	public void getEventsForProfile(int profileId, AsyncCallback<Event[]> callback);//;events associated with each user's profile
}