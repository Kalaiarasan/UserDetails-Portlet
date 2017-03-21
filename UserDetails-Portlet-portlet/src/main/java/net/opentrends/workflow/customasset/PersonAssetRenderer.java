package net.opentrends.workflow.customasset;

import java.util.Locale;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portlet.asset.model.BaseAssetRenderer;

import net.opentrends.user.model.Person;

public class PersonAssetRenderer extends BaseAssetRenderer {

	private Person _person;

	public PersonAssetRenderer(Person person) {
		_person = person;
	}

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return Person.class.getName();
	}

	@Override
	public long getClassPK() {
		// TODO Auto-generated method stub
		return _person.getPersonId();
	}

	@Override
	public long getGroupId() {
		// TODO Auto-generated method stub
		return _person.getGroupId();
	}

	@Override
	public String getTitle(Locale locale) {
		// TODO Auto-generated method stub
		return _person.getName();
	}

	@Override
	public long getUserId() {
		// TODO Auto-generated method stub
		return _person.getUserId();
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return _person.getUserName();
	}

	@Override
	public String getSummary(Locale locale) {
		// TODO Auto-generated method stub
		return _person.getName();
	}

	@Override
	public String getUuid() {
		// TODO Auto-generated method stub
		return _person.getUuid();
	}

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse, String template) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
