/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint;
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
 * Proxy class to handle a {@link Constraint} with << LogicalConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("53b9a5c1-0a76-403f-aa18-f79a25ba62a5")
public class LogicalConstraint extends CompositeConstraint {
    @objid ("6400bb48-e38d-4e28-99a4-3c44c5337353")
    public static final String STEREOTYPE_NAME = "LogicalConstraint";

    @objid ("8a862058-b36e-4622-9686-f5977a32761d")
    public static final String LOGICALOPERATOR_TAGTYPE = "logicalOperator";

    /**
     * Tells whether a {@link LogicalConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << LogicalConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("20f518de-3afe-473e-b239-e325cfa52d15")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LogicalConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << LogicalConstraint >> then instantiate a {@link LogicalConstraint} proxy.
     * 
     * @return a {@link LogicalConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("a47bf4d8-b2dd-46f6-9568-87d2135825f9")
    public static LogicalConstraint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, LogicalConstraint.STEREOTYPE_NAME);
        return LogicalConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link LogicalConstraint} proxy from a {@link Constraint} stereotyped << LogicalConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link LogicalConstraint} proxy or <i>null</i>.
     */
    @objid ("35b9e132-2aca-4b34-808d-221fb2aa04b2")
    public static LogicalConstraint instantiate(final Constraint obj) {
        return LogicalConstraint.canInstantiate(obj) ? new LogicalConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link LogicalConstraint} proxy from a {@link Constraint} stereotyped << LogicalConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link LogicalConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("26e51780-b414-478e-872f-2ae089d6ce50")
    public static LogicalConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (LogicalConstraint.canInstantiate(obj))
        	return new LogicalConstraint(obj);
        else
        	throw new IllegalArgumentException("LogicalConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'constraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("52ed83be-a16c-4b64-bd1a-9d1349769c9f")
    public void addConstraints(final CamelConstraint obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), LogicalConstraint.MdaTypes.MDAASSOCDEP);
            d.setName("constraints");
            d.putTagValue(LogicalConstraint.MdaTypes.MDAASSOCDEP_ROLE, "constraints");
        }
    }

    @objid ("83451a10-0f1f-4b88-b68a-46dc656abb00")
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
        LogicalConstraint other = (LogicalConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'constraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cae44381-751a-46c1-a39c-9af0b83fb06f")
    public List<CamelConstraint> getConstraints() {
        List<CamelConstraint> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(LogicalConstraint.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(LogicalConstraint.MdaTypes.MDAASSOCDEP_ROLE), "constraints")){
              if (MetricConstraint.canInstantiate(d.getDependsOn()))
                results.add((MetricConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricConstraint.MdaTypes.STEREOTYPE_ELT.getName()));
              if (AttributeConstraint.canInstantiate(d.getDependsOn()))
                results.add((AttributeConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeConstraint.MdaTypes.STEREOTYPE_ELT.getName()));
              if (MetricVariableConstraint.canInstantiate(d.getDependsOn()))
                results.add((MetricVariableConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricVariableConstraint.MdaTypes.STEREOTYPE_ELT.getName()));
              if (IfThenConstraint.canInstantiate(d.getDependsOn()))
                results.add((IfThenConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), IfThenConstraint.MdaTypes.STEREOTYPE_ELT.getName()));
              if (LogicalConstraint.canInstantiate(d.getDependsOn()))
                results.add((LogicalConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LogicalConstraint.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("a3c7d471-ad93-477f-b25a-dd24ad0c0ab6")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'logicalOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e3cc226c-f3b0-4ce6-a0fa-3c5da5b6fd4d")
    public String getLogicalOperator() {
        return this.elt.getTagValue(LogicalConstraint.MdaTypes.LOGICALOPERATOR_TAGTYPE_ELT);
    }

    @objid ("9ab564a1-4247-49e4-8235-18ef38042cb5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'constraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d13a1620-b4c6-4a80-91f5-91950a400da2")
    public boolean removeConstraints(final CamelConstraint obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(LogicalConstraint.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(LogicalConstraint.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'logicalOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("07c35a8e-2e07-4d91-8506-18a2528ea0de")
    public void setLogicalOperator(final String value) {
        this.elt.putTagValue(LogicalConstraint.MdaTypes.LOGICALOPERATOR_TAGTYPE_ELT, value);
    }

    @objid ("cecf2787-76fc-4efb-8c6a-9365a22290d6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("c752c081-0326-4622-9ec5-0a188078139a")
    protected LogicalConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("f5630e18-22a2-424e-9cbf-865d8acd7362")
    public static final class MdaTypes {
        @objid ("6d81c002-6997-49bc-88a6-d1b0911a60ed")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8f5cdb49-3c49-44be-8751-435ecc4e4bd1")
        public static TagType LOGICALOPERATOR_TAGTYPE_ELT;

        @objid ("3cc7d302-2a0f-4801-97a0-a0b4e1267105")
        private static Stereotype MDAASSOCDEP;

        @objid ("6b0402bf-759f-44cf-b505-a3f2091ea251")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("44b5d127-d305-47aa-a127-dcb7d7ff4be7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a266bdba-acc2-4ce2-81a0-4b2f404f7db7");
            LOGICALOPERATOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "eb2e6178-406b-46d5-80d2-5453be9fce45");
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
