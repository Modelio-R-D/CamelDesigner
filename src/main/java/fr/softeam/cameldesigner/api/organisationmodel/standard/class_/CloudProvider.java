/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
 * Proxy class to handle a {@link Class} with << CloudProvider >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fb9d9a88-d4a0-4e3f-a3de-0a99ce0662d5")
public class CloudProvider extends Organisation {
    @objid ("755e6cd4-57f4-4c6a-b19a-f3a7934a09f4")
    public static final String STEREOTYPE_NAME = "CloudProvider";

    @objid ("29f4be1d-a4b5-4dcb-be2c-05a89a11424c")
    public static final String IAAS_TAGTYPE = "IaaS";

    @objid ("ccc829c4-5540-47a3-b824-fba9bf7b4d6e")
    public static final String PAAS_TAGTYPE = "PaaS";

    @objid ("429c192d-e588-4b84-a27a-d9352d881546")
    public static final String SAAS_TAGTYPE = "SaaS";

    @objid ("c5cbf49d-6b9f-4fcf-97b3-01237d9bc7b1")
    public static final String PUBLIC_TAGTYPE = "public";

    /**
     * Tells whether a {@link CloudProvider proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CloudProvider >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("87878158-d2c1-40ce-82ee-9910b0bd5ee0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudProvider.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CloudProvider >> then instantiate a {@link CloudProvider} proxy.
     * 
     * @return a {@link CloudProvider} proxy on the created {@link Class}.
     */
    @objid ("01305642-d024-4c26-b569-ada0d58fb992")
    public static CloudProvider create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CloudProvider.STEREOTYPE_NAME);
        return CloudProvider.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CloudProvider} proxy from a {@link Class} stereotyped << CloudProvider >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CloudProvider} proxy or <i>null</i>.
     */
    @objid ("0917eb69-d951-4acb-9331-606e71bc5bf7")
    public static CloudProvider instantiate(final Class obj) {
        return CloudProvider.canInstantiate(obj) ? new CloudProvider(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CloudProvider} proxy from a {@link Class} stereotyped << CloudProvider >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CloudProvider} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6d53871f-b755-414a-b91c-d455e9ebc38f")
    public static CloudProvider safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CloudProvider.canInstantiate(obj))
        	return new CloudProvider(obj);
        else
        	throw new IllegalArgumentException("CloudProvider: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("df787708-85e9-4320-8d2b-28ffccac69b3")
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
        CloudProvider other = (CloudProvider) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("674928b1-f871-44e6-9db2-5dd6fff9e414")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("2860dae5-3225-4785-95a2-deda7718281c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b6e395ee-4aba-4d1f-b496-d632ac885f20")
    public boolean isIaaS() {
        return this.elt.isTagged(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("02f67296-d102-4c3d-9bae-35c8c8d002d3")
    public boolean isPaaS() {
        return this.elt.isTagged(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7d586119-608b-49fe-9ce4-40ef8c531aba")
    public boolean isPublic() {
        return this.elt.isTagged(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("46b5bb69-cc24-4308-a1f4-ed873af3c263")
    public boolean isSaaS() {
        return this.elt.isTagged(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fabeed56-6a00-4adf-89dd-8f9af6dde07e")
    public void setIaaS(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7bd12fe7-7297-4dd9-aa1d-f1ea7b98225e")
    public void setPaaS(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aebcb52e-b6cf-4d53-9329-44c72ab01342")
    public void setPublic(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cc2cd79e-3a8f-4a19-8b80-0b3b8ad12f8b")
    public void setSaaS(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT);
    }

    @objid ("88addc4b-73d6-4a23-8191-8ea1c4a030ce")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c9c8ccac-12e6-46cb-aa72-c228e9c87c54")
    protected CloudProvider(final Class elt) {
        super(elt);
    }

    @objid ("3a9e1b7d-4edb-4361-aa5d-657d494731fb")
    public static final class MdaTypes {
        @objid ("ee508c7d-3e19-4989-88ce-3b12fc046617")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1f51e70f-54f3-4066-93ca-04dfcb311b0e")
        public static TagType PUBLIC_TAGTYPE_ELT;

        @objid ("bd7d555b-692b-41e8-98cc-14c2b808653f")
        public static TagType SAAS_TAGTYPE_ELT;

        @objid ("3a756ca9-3560-455b-8985-a2c9a5aab7b3")
        public static TagType PAAS_TAGTYPE_ELT;

        @objid ("a2d0c414-3446-419d-8a99-209c398e9b17")
        public static TagType IAAS_TAGTYPE_ELT;

        @objid ("6c4e549d-8d6b-4382-8321-96a9eafe9af9")
        private static Stereotype MDAASSOCDEP;

        @objid ("273fdad8-45ea-407b-905b-a287b3d9f2b6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("182b2a22-6ecb-40c2-a855-e1be1629edbc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "eb3e5683-72bd-4e46-8bda-1ea07af0c09e");
            PUBLIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a7b7a414-a54a-45b1-a53e-3126883211b8");
            SAAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f42c6540-bd96-497b-9689-075610b04eda");
            PAAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d89c42d7-ad3d-49e1-a24d-46b82e7965ac");
            IAAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e33192b2-ce6c-499c-98c5-167d63c32690");
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
