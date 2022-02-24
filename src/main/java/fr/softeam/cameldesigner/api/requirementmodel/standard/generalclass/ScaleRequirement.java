/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("22fc00b7-5a79-4da0-887e-1acc868eb275")
    public static final String STEREOTYPE_NAME = "ScaleRequirement";

    /**
     * Tells whether a {@link ScaleRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link GeneralClass} stereotyped << ScaleRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e6a503aa-9296-4d8a-94c6-10eb191550d9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof GeneralClass) && ((GeneralClass) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScaleRequirement.STEREOTYPE_NAME));
    }

    @objid ("a830592d-8622-4f44-b2d2-cfc70448dded")
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
    @objid ("965209a4-2924-473b-82b9-c29f6b3564dd")
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

    @objid ("e062ed1c-5025-49c5-8c34-a7e810d8c11a")
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

    @objid ("cd34903f-f0c0-47bf-9a35-a0ab2db87d10")
    protected ScaleRequirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("d2c43198-3b6c-4edb-b389-c4724bf797a0")
    public static final class MdaTypes {
        @objid ("4e825cdf-f9d2-43dc-a31a-51944b06d30f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2aa64bd8-7fe6-4f4a-8c17-0c3920a7fe40")
        private static Stereotype MDAASSOCDEP;

        @objid ("3e22aa72-bd7c-4b19-8ced-33da74ab0ab5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("44f93629-ac71-41e1-a73b-f5fa214e030e")
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
