/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("1df4c880-75c5-4509-badd-b0e730d1472b")
    public static final String STEREOTYPE_NAME = "ScaleRequirement";

    /**
     * Tells whether a {@link ScaleRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link GeneralClass} stereotyped << ScaleRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c9a07529-a559-43dd-abbf-a4cc6fe4b1a0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof GeneralClass) && ((GeneralClass) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScaleRequirement.STEREOTYPE_NAME));
    }

    @objid ("e1f6a512-af8a-4519-81ad-9500278892a1")
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
    @objid ("376a45e7-73f2-4a80-affc-c36926c340aa")
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

    @objid ("be1c02e3-7afe-42ce-b72d-88f716a6e773")
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

    @objid ("f729787e-3627-4be9-b2d2-9b55112d1d9c")
    protected ScaleRequirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("d2c43198-3b6c-4edb-b389-c4724bf797a0")
    public static final class MdaTypes {
        @objid ("c7ca2fc5-5c37-4619-8af2-50f8b0e7c4c6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("924ddeb6-d126-4443-bb92-6818c6c6662d")
        private static Stereotype MDAASSOCDEP;

        @objid ("efaed7a2-84a2-4de1-bfc3-f0f82df14a35")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3f281d5f-f5aa-4408-9a99-ef18c79db360")
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
