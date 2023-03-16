/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
@objid ("d9a378e5-4189-4afa-b730-192dcefc8515")
public class Sequence extends Feature {
    @objid ("2e47881c-28fe-4b43-9181-003316b57a4b")
    public static final String STEREOTYPE_NAME = "Sequence";

    /**
     * Tells whether a {@link Sequence proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Sequence >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cf87fc51-f2ca-45c0-9ae0-091aa399c57a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Sequence.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Sequence >> then instantiate a {@link Sequence} proxy.
     * 
     * @return a {@link Sequence} proxy on the created {@link Constraint}.
     */
    @objid ("092afd0b-945e-40cd-9bf4-f1cf70da60c1")
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
    @objid ("42fc00fa-d895-48a1-a885-9175e962a3b1")
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
    @objid ("e1925ca2-e0e2-454f-9374-34aca9f54039")
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
    @objid ("726e8f9e-610e-4a80-87a8-65ed4f7ff674")
    public void addComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Sequence.MdaTypes.MDAASSOCDEP);
            d.setName("components");
            d.putTagValue(Sequence.MdaTypes.MDAASSOCDEP_ROLE, "components");
        }
    }

    @objid ("155daf51-a66d-46fa-a21b-7e467056c897")
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
    @objid ("e098e380-91e8-437a-95d7-c785a5112205")
    public List<SoftwareComponent> getComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(Sequence.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Sequence.MdaTypes.MDAASSOCDEP_ROLE), "components")){
              if (Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
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
    @objid ("a6b20050-c886-4ee5-b896-70b7d15bfb92")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("6543515f-2a09-4536-b3bc-61500797b8fc")
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
    @objid ("f56222ea-2d67-4cfe-8adb-5c5a9b99eacb")
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

    @objid ("f50bf1e6-3b82-4792-911b-401516ed824c")
    protected Sequence(final Constraint elt) {
        super(elt);
    }

    @objid ("6110076e-f449-4d1e-8f10-0279448e369b")
    public static final class MdaTypes {
        @objid ("eb94eec1-7608-44a1-8e8e-04c790103f4f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c01cb38b-c368-4a5d-88de-fd5ccdc00434")
        private static Stereotype MDAASSOCDEP;

        @objid ("2e01ef4b-53f1-479a-b0c7-5524d2d6adb9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("856712fd-fd0a-43da-b22c-7ed2d961446d")
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
