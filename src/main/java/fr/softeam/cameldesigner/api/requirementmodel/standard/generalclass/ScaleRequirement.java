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
 * Proxy class to handle a {@link GeneralClass} with << ScaleRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2e2e4b39-28e1-4131-aec8-59bd318e7b00")
public abstract class ScaleRequirement extends HardRequirement {
<<<<<<< HEAD
    @objid ("b0fd9b65-6418-4fc0-b32a-5e2de5bc29fc")
=======
    @objid ("fd4d96a3-d7a0-497b-8fc0-e2a76fbbf3c5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "ScaleRequirement";

    /**
     * Tells whether a {@link ScaleRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link GeneralClass} stereotyped << ScaleRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("f8904e1c-9370-4d4d-83ec-070149fa1cea")
=======
    @objid ("7955ad0f-c9bb-43ca-9ddc-0ab8b1c19567")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof GeneralClass) && ((GeneralClass) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScaleRequirement.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("d65f9f77-8878-456d-b6d5-f43837e03339")
=======
    @objid ("64a4d226-5abe-47cb-a8d8-e5255f9245d8")
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
        ScaleRequirement other = (ScaleRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link GeneralClass}. 
     * @return the GeneralClass represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("5cdefe24-5ecf-455f-b3ce-91b4cd2e1e94")
=======
    @objid ("f4c97179-9f69-4389-bdc5-85eb5f194cd7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

<<<<<<< HEAD
    @objid ("a6bb16e0-c116-4220-8421-9711fe0c6969")
=======
    @objid ("ffda71a7-59af-4bf6-8a95-c230c4b40945")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("11599460-0842-4fd7-b20a-5df2893dc158")
=======
    @objid ("8ec66a11-334d-4abe-a67f-d3236e7b109e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ScaleRequirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("d2c43198-3b6c-4edb-b389-c4724bf797a0")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("ae0f3a8d-9199-48c3-a3ab-76d333dea053")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bf2f3ba6-a5b7-4cf0-ae2b-28c477c1ee91")
        private static Stereotype MDAASSOCDEP;

        @objid ("cd6a9a5d-1332-4bf3-9ddd-7e705095e256")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3fcaf702-7f7f-47a4-bece-2cb3176fe351")
=======
        @objid ("360f9203-eb1b-4b1d-9c43-5e18019f7557")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0414183a-01a1-423c-8155-c8f423880977")
        private static Stereotype MDAASSOCDEP;

        @objid ("8c0ada16-b513-4a4b-b13f-babefc0bf6e1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("23748e79-e34f-45a2-9cbe-61c508136d87")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
