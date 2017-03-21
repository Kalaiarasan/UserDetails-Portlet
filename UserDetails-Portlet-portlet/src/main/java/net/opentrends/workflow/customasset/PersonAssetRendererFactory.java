package net.opentrends.workflow.customasset;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.BaseAssetRendererFactory;

import net.opentrends.user.model.Person;
import net.opentrends.user.service.PersonLocalServiceUtil;

public class PersonAssetRendererFactory extends BaseAssetRendererFactory {

	@Override
	public AssetRenderer getAssetRenderer(long classPK, int type) throws PortalException, SystemException {
		Person person = PersonLocalServiceUtil.getPerson(classPK);
		return new PersonAssetRenderer(person);
	}

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return CLASS_NAME;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return TYPE;
	}
	public static final String TYPE = "Person";
	public static final String CLASS_NAME = Person.class.getName();
}
