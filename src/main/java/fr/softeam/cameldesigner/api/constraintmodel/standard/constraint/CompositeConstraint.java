/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << CompositeConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bf982af0-30cc-42f7-934c-17e02bb00b58")
public abstract class CompositeConstraint extends CamelConstraint {
    @objid ("eb5add46-c1ac-4e1d-b6ba-8414b1bc079f")
    public static final String STEREOTYPE_NAME = "CompositeConstraint";

    /**
     * Tells whether a {@link CompositeConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << CompositeConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8907ce74-aaf0-40bc-abc4-2609f0c5233d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeConstraint.STEREOTYPE_NAME));
    }

    @objid ("0c7f50b9-cec7-42d1-8479-a33d22ab05e8")
    public static CompositeConstraint instantiate(final Constraint obj) {
        return IfThenConstraint.canInstantiate(obj) ? IfThenConstraint.instantiate(obj) :
            LogicalConstraint.canInstantiate(obj) ? LogicalConstraint.instantiate(obj) : null;
    }

    @objid ("c53f647f-da65-4947-8c24-6ead86be52e6")
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
        CompositeConstraint other = (CompositeConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("df73d922-b8b4-4318-a5fb-753fbf46b774")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("4fb9584c-7c59-4cde-8a76-63ad2a269aa1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5b40d8b4-09bd-47c8-9449-22861970e03f")
    protected CompositeConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("16d6b202-8190-4fdc-ad51-7afb89d0af01")
    public static final class MdaTypes {
        @objid ("28b06818-affd-4d00-9ca6-8b424c4dcf35")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("87de032b-6706-4e0f-92b6-524b6053cfa5")
        private static Stereotype MDAASSOCDEP;

        @objid ("0214b877-608c-40c3-b96c-f7513ad67225")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("676e7ba8-f71c-46ed-a9fd-ab17d02cea22")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "95f69da8-e7d7-494b-90a7-db1618fa56fc");
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
