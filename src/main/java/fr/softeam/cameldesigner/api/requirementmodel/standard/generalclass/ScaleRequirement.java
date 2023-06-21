/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
 * Proxy class to handle a {@link GeneralClass} with << ScaleRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2e2e4b39-28e1-4131-aec8-59bd318e7b00")
public abstract class ScaleRequirement extends HardRequirement {
    @objid ("683a9c3c-8369-4f33-9b2e-09aec3e5510f")
    public static final String STEREOTYPE_NAME = "ScaleRequirement";

    /**
     * Tells whether a {@link ScaleRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link GeneralClass} stereotyped << ScaleRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("920ee01b-b1d7-44df-b1f8-3601c01ef013")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof GeneralClass) && ((GeneralClass) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScaleRequirement.STEREOTYPE_NAME));
    }

    @objid ("14ef01ea-fd64-4cb7-9c74-4a366fe9c312")
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
        ScaleRequirement other = (ScaleRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link GeneralClass}. 
     * @return the GeneralClass represented by this proxy, never null.
     */
    @objid ("383643d4-4557-4e2a-a454-6ff79258de6d")
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

    @objid ("c4d42188-f9bb-487f-8652-7ab131195dc6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("db884c27-8e6a-452e-bd22-9810e37df2d5")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("abd5aff7-b12b-40d8-aaba-14e8370f2e02")
    protected ScaleRequirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("d2c43198-3b6c-4edb-b389-c4724bf797a0")
    public static final class MdaTypes {
        @objid ("676fa613-b169-437c-98f7-447cd9edb9d1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2d5df3ab-525b-47fa-86be-fc8f99f188cf")
        private static Stereotype MDAASSOCDEP;

        @objid ("bab7d102-cb27-4de6-bed0-41c6c07cb75a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f216b91d-3f35-421e-ac40-e4b2fbdd20d1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "92dc2d3d-2985-4da0-bc0e-3a4f5e00e269");
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
