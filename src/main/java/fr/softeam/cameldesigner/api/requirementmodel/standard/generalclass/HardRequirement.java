/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
 * Proxy class to handle a {@link GeneralClass} with << HardRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("892ed9c7-a02c-433e-a591-388ee6839707")
public abstract class HardRequirement extends Requirement {
<<<<<<< HEAD
    @objid ("0f2dfcf9-13fc-45b3-b96c-84c4daff15f5")
=======
    @objid ("183220fc-e066-4795-b9ea-352939ba3c0f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "HardRequirement";

    /**
     * Tells whether a {@link HardRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link GeneralClass} stereotyped << HardRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("d7d9f2e8-ba5f-4e2e-a5f5-9a288d4a7f6e")
=======
    @objid ("825c4782-7f78-4134-9461-889200897b58")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof GeneralClass) && ((GeneralClass) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HardRequirement.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("1e133c4e-c767-415d-8da4-cbcc36306199")
=======
    @objid ("8ad5d0d3-10f9-4541-a991-33ddb7db9b0d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
        HardRequirement other = (HardRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link GeneralClass}. 
     * @return the GeneralClass represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("97679b15-30fc-45be-b54b-3cb503ca27ad")
=======
    @objid ("1295e5d9-9d25-405a-88a6-05297641247e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

<<<<<<< HEAD
    @objid ("aae83408-cc37-4e09-8458-c1aace6c795c")
=======
    @objid ("d25c2198-0bd8-41b8-883e-b7f5be936594")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3c194cf2-fa4b-4d8a-968e-2ee76518559e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("7f6a4c98-9ebf-48a2-9057-2b92be5cd94f")
=======
    @objid ("c2e4a1fc-4838-4cb1-bd3d-20ce661e190d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected HardRequirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("024b0a43-76f9-4df6-8a5c-e5e800794153")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("2be43d5b-3e82-4892-8f7a-0fbb433c4a86")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("50e15911-36d7-4be5-88ea-037a3f6cf620")
        private static Stereotype MDAASSOCDEP;

        @objid ("c697f9a9-9aad-43c8-b235-2c3df7b93d89")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dffbb56d-39de-42dd-b786-76631a5ef646")
=======
        @objid ("66595d8f-b3ef-49ec-bf36-13c056347cef")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5f4a1fe7-a466-4e20-bfce-017571d7a8c5")
        private static Stereotype MDAASSOCDEP;

        @objid ("9c517215-5c5c-439c-8f0e-ff1c8c355d3a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f4609a2d-5fb9-4c38-951c-4d8fbee77640")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2955347c-7823-427d-af9e-c725897bba1c");
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
