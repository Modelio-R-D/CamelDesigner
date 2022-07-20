/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.namespace.ScalingAction;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << HorizontalScalingAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9043ebaf-e900-49af-8abc-87dbea13b475")
public class HorizontalScalingAction extends ScalingAction {
    @objid ("8b2bef21-615e-436a-8195-e197a2c3fe8e")
    public static final String STEREOTYPE_NAME = "HorizontalScalingAction";

    @objid ("82907875-ce60-4a7d-99c4-2e3d787a2aee")
    public static final String COUNT_TAGTYPE = "count";

    /**
     * Tells whether a {@link HorizontalScalingAction proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HorizontalScalingAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a3bc0956-d700-4fa9-9a08-1e07e03ce42c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HorizontalScalingAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HorizontalScalingAction >> then instantiate a {@link HorizontalScalingAction} proxy.
     * 
     * @return a {@link HorizontalScalingAction} proxy on the created {@link Class}.
     */
    @objid ("c56150bb-9264-44db-983d-1c84a9f3f501")
    public static HorizontalScalingAction create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HorizontalScalingAction.STEREOTYPE_NAME);
        return HorizontalScalingAction.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link HorizontalScalingAction} proxy from a {@link Class} stereotyped << HorizontalScalingAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link HorizontalScalingAction} proxy or <i>null</i>.
     */
    @objid ("8961d141-311b-40a7-9d1a-db617ed10b53")
    public static HorizontalScalingAction instantiate(final Class obj) {
        return HorizontalScalingAction.canInstantiate(obj) ? new HorizontalScalingAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HorizontalScalingAction} proxy from a {@link Class} stereotyped << HorizontalScalingAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link HorizontalScalingAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d07d348e-5281-4d73-a069-22567000a8eb")
    public static HorizontalScalingAction safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HorizontalScalingAction.canInstantiate(obj))
        	return new HorizontalScalingAction(obj);
        else
        	throw new IllegalArgumentException("HorizontalScalingAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fe0dfc52-a2bd-4a77-a4d0-8619e7626c48")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HorizontalScalingAction other = (HorizontalScalingAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'count'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2701d844-529a-4dae-a94d-6b675b1507ec")
    public String getCount() {
        return this.elt.getTagValue(HorizontalScalingAction.MdaTypes.COUNT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("6caf2925-32f0-4c55-bbda-9ddeb960851c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("ef4c7b0c-0910-4625-b55c-36981f0911f6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'count'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("87bdfb13-c756-43d3-9200-bbad9e5eabb3")
    public void setCount(final String value) {
        this.elt.putTagValue(HorizontalScalingAction.MdaTypes.COUNT_TAGTYPE_ELT, value);
    }

    @objid ("6dc98a86-5601-487a-8855-ca9e418fc552")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("020437f0-7c94-4243-8e08-161ff5020184")
    protected HorizontalScalingAction(final Class elt) {
        super(elt);
    }

    @objid ("903e4b65-68e5-46fa-8af6-f2905c82423f")
    public static final class MdaTypes {
        @objid ("42bdeb0c-eee3-4fe5-97f5-64ff3fd84d6a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a6b457f8-1fca-4280-9b71-aa89a4372279")
        public static TagType COUNT_TAGTYPE_ELT;

        @objid ("859f1659-3dc0-4111-a1c7-434974074c54")
        private static Stereotype MDAASSOCDEP;

        @objid ("97b70a9f-8d4d-4bcd-be50-79a46468d1d9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a108977b-bc78-43b9-b143-1eeddfa0d841")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "99008d6c-2622-4467-8283-6059df42c240");
            COUNT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d52b6541-1841-4607-96a8-591ad329e65f");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(CamelDesignerModule.getInstance() != null) {
			init(CamelDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
