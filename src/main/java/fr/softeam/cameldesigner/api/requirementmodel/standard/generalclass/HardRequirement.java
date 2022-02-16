/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("df484109-158f-462a-bd42-5874761ce205")
    public static final String STEREOTYPE_NAME = "HardRequirement";

    /**
     * Tells whether a {@link HardRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link GeneralClass} stereotyped << HardRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5cb76e14-a692-4c74-b316-95321ee1299a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof GeneralClass) && ((GeneralClass) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HardRequirement.STEREOTYPE_NAME));
    }

    @objid ("e471a84d-b176-43be-86dd-34dd89c4eae7")
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
    @objid ("288d4da1-7cfd-4141-8d65-e7db0d981695")
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

    @objid ("00cfe3ce-75e1-4b6d-9b41-4524ea74562c")
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

    @objid ("3f311eb8-a92d-4423-ae92-d3a02004247f")
    protected HardRequirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("024b0a43-76f9-4df6-8a5c-e5e800794153")
    public static final class MdaTypes {
        @objid ("10667294-90e1-4421-beda-759c575ed49b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("12212cc0-d240-4eeb-81e3-d411fec859f0")
        private static Stereotype MDAASSOCDEP;

        @objid ("276ef28a-79f9-4e0e-b957-6062b86f615b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("abac55a5-0af9-4aa1-b4d5-3ba764ad90b6")
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
