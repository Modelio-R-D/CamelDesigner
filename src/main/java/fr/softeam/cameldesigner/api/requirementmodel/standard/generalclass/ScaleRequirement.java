/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("48e69a0d-94e8-48ee-9852-8bb07167f622")
    public static final String STEREOTYPE_NAME = "ScaleRequirement";

    /**
     * Tells whether a {@link ScaleRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link GeneralClass} stereotyped << ScaleRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("911373bf-808c-4d7b-a565-7fdf9b42774c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof GeneralClass) && ((GeneralClass) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScaleRequirement.STEREOTYPE_NAME));
    }

    @objid ("e62cfe36-b7f6-4c70-b10a-40642ab4e0de")
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
    @objid ("c5e09bdf-d8bf-4037-8077-bf1764a0b881")
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

    @objid ("9460a651-a442-4359-8352-6764fe5171e5")
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

    @objid ("fc25fab8-49d7-4627-a17b-e93059288571")
    protected ScaleRequirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("d2c43198-3b6c-4edb-b389-c4724bf797a0")
    public static final class MdaTypes {
        @objid ("2fc56691-ffb3-4574-bc2c-6e1766ce81e6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("390b3ae8-7c3b-4492-8816-2ce5cb5f5f68")
        private static Stereotype MDAASSOCDEP;

        @objid ("093c9bf8-ec0b-4a9d-b768-7c218f3e2f7a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b788f195-5099-4251-900a-2437c7e75efb")
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
