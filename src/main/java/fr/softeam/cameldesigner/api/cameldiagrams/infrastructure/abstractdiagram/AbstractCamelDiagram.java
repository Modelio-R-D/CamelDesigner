/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("751764ba-30fc-4573-ac80-0559a08df946")
    public static final String STEREOTYPE_NAME = "AbstractCamelDiagram";

    /**
     * Tells whether a {@link AbstractCamelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link AbstractDiagram} stereotyped << AbstractCamelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9b0c36cd-999a-4935-a460-d332b688c88e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AbstractDiagram) && ((AbstractDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AbstractCamelDiagram.STEREOTYPE_NAME));
    }

    @objid ("737bc4e1-333b-4d09-87cd-7899726137cf")
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
     * 
     * @return the AbstractDiagram represented by this proxy, never null.
     */
    @objid ("1efaaa42-2aa7-42e5-a16a-b63ab6032294")
    @Override
    public AbstractDiagram getElement() {
        return (AbstractDiagram)super.getElement();
    }

    @objid ("77307449-5c0a-4f32-a46c-1e50d1652af7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("81bb3166-10f6-4266-ab1b-a303a90bb571")
    protected AbstractCamelDiagram(final AbstractDiagram elt) {
        super(elt);
    }

    @objid ("96cdd4aa-6ccf-4f23-a3d7-5aaaba7243d3")
    public static final class MdaTypes {
        @objid ("506b1261-3ded-4f2c-b3c3-90c69b310fdd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d76a68c2-8a8c-4927-a19e-ada93d84aa87")
        private static Stereotype MDAASSOCDEP;

        @objid ("a698121d-0adc-4109-a2a2-2f45afe7ceda")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7b567359-0e07-4d42-9ca8-9a42c6ecb24e")
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
