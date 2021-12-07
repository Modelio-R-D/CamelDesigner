/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.infrastructure.abstractdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement;
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
public abstract class AbstractCamelDiagram extends NamedElement {
    @objid ("07ebc238-7d39-44c9-a9e5-742b22512543")
    public static final String STEREOTYPE_NAME = "AbstractCamelDiagram";

    @objid ("be5c053f-5226-4be6-84b0-6a413de40339")
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
    @objid ("7e685b35-4de7-4fbd-a240-4d5de2ed91e3")
    @Override
    public AbstractDiagram getElement() {
        return (AbstractDiagram)super.getElement();
    }

    @objid ("846d9e8b-8f78-4d07-a4f7-ea926a8d26cd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("687dbc5a-c6a7-45f5-8f72-e71f4829741b")
    protected AbstractCamelDiagram(final AbstractDiagram elt) {
        super(elt);
    }

    @objid ("96cdd4aa-6ccf-4f23-a3d7-5aaaba7243d3")
    public static final class MdaTypes {
        @objid ("72af7f83-a607-45d8-a9d8-53f269fc906a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d166b4ee-584f-49be-8e46-6cc70641e15b")
        private static Stereotype MDAASSOCDEP;

        @objid ("79c9c7df-577f-4594-8aab-86203abd6c2f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b76413a8-7807-4862-9288-1ad9a71759a1")
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
