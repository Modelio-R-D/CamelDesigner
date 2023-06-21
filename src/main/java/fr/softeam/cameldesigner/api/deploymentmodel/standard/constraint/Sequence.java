/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import fr.softeam.cameldesigner.api.profiler.standard.component.ProfilerComponent;
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
 * Proxy class to handle a {@link Constraint} with << Sequence >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9219c05c-152d-4e53-ae48-5ebe1107dcaa")
public class Sequence extends Feature {
    @objid ("486bd680-4819-44fc-b68f-47cf386d0236")
    public static final String STEREOTYPE_NAME = "Sequence";

    /**
     * Tells whether a {@link Sequence proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Sequence >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("206aa4b0-f8d0-4863-ba66-d8379ecac893")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Sequence.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Sequence >> then instantiate a {@link Sequence} proxy.
     * 
     * @return a {@link Sequence} proxy on the created {@link Constraint}.
     */
    @objid ("7d861f1c-ff32-4455-9d93-5e245ec30c00")
    public static Sequence create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Sequence.STEREOTYPE_NAME);
        return Sequence.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link Sequence} proxy from a {@link Constraint} stereotyped << Sequence >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link Sequence} proxy or <i>null</i>.
     */
    @objid ("afbd9fbe-5549-4bcb-b53a-cbc29f9fa204")
    public static Sequence instantiate(final Constraint obj) {
        return Sequence.canInstantiate(obj) ? new Sequence(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Sequence} proxy from a {@link Constraint} stereotyped << Sequence >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link Sequence} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("048d3e43-ed79-450e-970b-aae9d6e1eaff")
    public static Sequence safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (Sequence.canInstantiate(obj))
        	return new Sequence(obj);
        else
        	throw new IllegalArgumentException("Sequence: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'components' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("34f44f2d-bcc8-4b8c-869f-b0bc495bf77d")
    public void addComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Sequence.MdaTypes.MDAASSOCDEP);
            d.setName("components");
            d.putTagValue(Sequence.MdaTypes.MDAASSOCDEP_ROLE, "components");
        }
    }

    @objid ("dbcb97a0-c930-4cb2-b849-d3baef05d8f8")
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
        Sequence other = (Sequence) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'components' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7c0681f6-4bfe-4f77-b081-e2b45ab45cc8")
    public List<SoftwareComponent> getComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(Sequence.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Sequence.MdaTypes.MDAASSOCDEP_ROLE), "components")){
              if (Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
              if (ProfilerComponent.canInstantiate(d.getDependsOn()))
                results.add((ProfilerComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ProfilerComponent.MdaTypes.STEREOTYPE_ELT.getName()));
              if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                results.add((SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("dbabcb24-2094-4a38-ab5c-5d60d07a0464")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("116739f9-9db5-4a48-97db-112e2cf8e0e3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'components' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4542768d-5def-4f38-85f3-122c866a6a53")
    public boolean removeComponents(final SoftwareComponent obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(Sequence.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Sequence.MdaTypes.MDAASSOCDEP_ROLE), "components")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("73ddd5d9-db3b-4872-8583-b718750a8757")
    protected Sequence(final Constraint elt) {
        super(elt);
    }

    @objid ("3ee55fbd-d058-4be3-b341-32ce6d6b6602")
    public static final class MdaTypes {
        @objid ("27777995-138f-40ac-a4e5-fe938603a992")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e75ab56e-1c9c-4409-aed1-3f346214f844")
        private static Stereotype MDAASSOCDEP;

        @objid ("f132f089-2d08-416f-b88d-ffe859814084")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("eeb2efc5-b5f9-4488-baff-63b2ca9b965e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ca145da8-ff7e-4edb-9b3c-d3bef9c006f2");
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
