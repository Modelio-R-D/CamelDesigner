/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Constraint} with << Parallel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4c244d09-57a9-4a83-bf17-30176a65e25c")
public class Parallel extends Feature {
    @objid ("14d2429c-5871-4f02-a24c-8b7573a16ea9")
    public static final String STEREOTYPE_NAME = "Parallel";

    /**
     * Tells whether a {@link Parallel proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Parallel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b38ef4e9-33a5-4ba9-8a0e-697d97a9baa5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Parallel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Parallel >> then instantiate a {@link Parallel} proxy.
     * 
     * @return a {@link Parallel} proxy on the created {@link Constraint}.
     */
    @objid ("9ba269db-e9d4-4fc3-9d1a-218f082fe5ce")
    public static Parallel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Parallel.STEREOTYPE_NAME);
        return Parallel.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link Parallel} proxy from a {@link Constraint} stereotyped << Parallel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link Parallel} proxy or <i>null</i>.
     */
    @objid ("4f81b3a5-deca-4521-ac73-3cf782d3b73a")
    public static Parallel instantiate(final Constraint obj) {
        return Parallel.canInstantiate(obj) ? new Parallel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Parallel} proxy from a {@link Constraint} stereotyped << Parallel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link Parallel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("be65fa20-d06f-4a74-b483-4f00a406050a")
    public static Parallel safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (Parallel.canInstantiate(obj))
        	return new Parallel(obj);
        else
        	throw new IllegalArgumentException("Parallel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'components' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ed4141a6-0dca-45c7-94e0-5757ea7b0d38")
    public void addComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Parallel.MdaTypes.MDAASSOCDEP);
            d.setName("components");
            d.putTagValue(Parallel.MdaTypes.MDAASSOCDEP_ROLE, "components");
        }
    }

    @objid ("09575853-d810-429c-a2bd-6978cedf4867")
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
        Parallel other = (Parallel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'components' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fc2ec113-d9d2-47a1-9c08-6f82edf723e7")
    public List<SoftwareComponent> getComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(Parallel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Parallel.MdaTypes.MDAASSOCDEP_ROLE), "components")){
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
    @objid ("fcc75db5-2e1c-4e7f-bf89-0b8209d1aa5f")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("e466f0f3-5630-45e7-9872-735db0b02533")
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
    @objid ("68773149-a055-4c9e-bf72-4636e938c866")
    public boolean removeComponents(final SoftwareComponent obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(Parallel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Parallel.MdaTypes.MDAASSOCDEP_ROLE), "components")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("9d93dfdb-6e62-46f6-8b83-abbea6b4e264")
    protected Parallel(final Constraint elt) {
        super(elt);
    }

    @objid ("0e0eaff4-fbfa-4eff-bde8-1b82a6b4da65")
    public static final class MdaTypes {
        @objid ("73ac73e5-2857-458a-b6f0-f192d4dbc73a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e111d37b-ffca-4b69-a9c1-1240a918831b")
        private static Stereotype MDAASSOCDEP;

        @objid ("4e699031-edfb-4e5f-954e-7b5dc28eb16c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f61a0b1e-05f4-43f2-af15-46414a16f49c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9ae85a6-7add-441a-90e4-b7487a23979d");
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
