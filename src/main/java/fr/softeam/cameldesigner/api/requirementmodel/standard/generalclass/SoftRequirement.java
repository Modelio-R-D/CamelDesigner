/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass;

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
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link GeneralClass} with << SoftRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("539e2a12-8c48-42f5-9783-5248ca11085c")
public abstract class SoftRequirement extends Requirement {
    @objid ("d3a37bda-518e-44d0-95fa-1f3ccf6e856b")
    public static final String STEREOTYPE_NAME = "SoftRequirement";

    @objid ("194bc3c3-8dc8-476a-ad97-dabb2800b44c")
    public static final String PRIORITY_TAGTYPE = "priority";

    /**
     * Tells whether a {@link SoftRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link GeneralClass} stereotyped << SoftRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c13aa50c-19d0-4462-8062-4edf3f270aba")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof GeneralClass) && ((GeneralClass) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftRequirement.STEREOTYPE_NAME));
    }

    @objid ("cbc86a8f-faec-46ce-b532-9e731a6ccabe")
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
        SoftRequirement other = (SoftRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link GeneralClass}. 
     * @return the GeneralClass represented by this proxy, never null.
     */
    @objid ("eb1f9853-cbe0-40f4-bb4a-cbff4bc57639")
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

    /**
     * Getter for string property 'priority'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f60f9d63-a327-4743-abdc-fa6ef39cddba")
    public String getPriority() {
        return this.elt.getTagValue(SoftRequirement.MdaTypes.PRIORITY_TAGTYPE_ELT);
    }

    @objid ("57710ac1-8ec6-422d-bba9-6e5e1cd5711a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'priority'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6eb9be88-1200-45a6-a5d5-8b631d7ccb13")
    public void setPriority(final String value) {
        this.elt.putTagValue(SoftRequirement.MdaTypes.PRIORITY_TAGTYPE_ELT, value);
    }

    @objid ("4e195c55-e872-4135-ba88-5cfc0cf2db22")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("e026ab07-f106-4aeb-a3ac-18e254723bd1")
    protected SoftRequirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("e11f1b31-a2cb-4b0a-a55c-c134d2473491")
    public static final class MdaTypes {
        @objid ("5d4f7d21-0de5-4f5e-a440-fa40aec6613d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d72a9006-8a67-4816-94ef-81ebd034b1b9")
        public static TagType PRIORITY_TAGTYPE_ELT;

        @objid ("a3d2c3aa-ad52-4620-ba15-aaa7d5dd8c96")
        private static Stereotype MDAASSOCDEP;

        @objid ("7ffe78ad-92e1-4206-b32f-6732c1db64d2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b905e563-fc41-4478-81c2-336c2d33806a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fc1abdeb-e2fa-4a04-9253-4e15a223bce2");
            PRIORITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f38e006-1584-4036-8ddc-f39a5b607306");
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
