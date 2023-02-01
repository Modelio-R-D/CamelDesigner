/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.cameldiagrams.infrastructure.abstractdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.ExpendableElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AbstractDiagram} with << AbstractCamelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6bdaebda-7701-4743-a8e3-51e9d10ac891")
public abstract class AbstractCamelDiagram extends ExpendableElement {
<<<<<<< HEAD
    @objid ("3d9d943e-5da0-4b6f-9f80-b2cfc6b917bb")
=======
    @objid ("b15ddb99-cf9e-48a8-bfcc-a5d564a9a7e5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "AbstractCamelDiagram";

    /**
     * Tells whether a {@link AbstractCamelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link AbstractDiagram} stereotyped << AbstractCamelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("41ea8ebe-4aa0-4709-b75b-dd44cd9aae6c")
=======
    @objid ("03270c58-fca0-4acd-b2c5-fa603466c1fa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AbstractDiagram) && ((AbstractDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AbstractCamelDiagram.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("34beffc3-085c-465a-b65f-7fc9aafa5b28")
=======
    @objid ("c23bd5de-2f03-4feb-97a9-e358068815ae")
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
        AbstractCamelDiagram other = (AbstractCamelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AbstractDiagram}. 
     * @return the AbstractDiagram represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("29e26aba-cad5-44fb-9484-3ee9aad96aad")
=======
    @objid ("9627d520-b44e-4f24-b94d-97ccf4c73274")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public AbstractDiagram getElement() {
        return (AbstractDiagram)super.getElement();
    }

<<<<<<< HEAD
    @objid ("5ba1d295-3eb3-48c4-bf91-259c4ad1e460")
=======
    @objid ("1e931f3a-3c34-4362-80a2-f70543fcd9b2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

<<<<<<< HEAD
    @objid ("802205a2-683d-46e2-b8ce-5024706ae00c")
=======
    @objid ("0a5ca448-a974-4ee7-8f1b-50f39e1605aa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected AbstractCamelDiagram(final AbstractDiagram elt) {
        super(elt);
    }

    @objid ("96cdd4aa-6ccf-4f23-a3d7-5aaaba7243d3")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("244b6581-6531-457f-a244-86ecd2464005")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b35b47b3-0c50-4220-8d95-531a4c635650")
        private static Stereotype MDAASSOCDEP;

        @objid ("58cfa77e-6b1f-4a42-826f-ac19f576dac9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dc76dd0e-d821-4ea4-a71d-7ec2e99f620d")
=======
        @objid ("c9774dd4-0684-4a5c-b7dc-104ab1bc6cea")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5ee6a09b-0225-4b25-8ee4-c0e9ba88500d")
        private static Stereotype MDAASSOCDEP;

        @objid ("cd926f2b-cfcf-4f27-a1fd-cdda043ac9f4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("99dbbb51-fc0f-48f9-8ee6-baa5eee74194")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c147d6d3-8bd0-4b94-a9d6-164a947fa0b4");
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
