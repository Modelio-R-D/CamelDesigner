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
 * Proxy class to handle a {@link Constraint} with << Parallel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2417958a-da55-4ceb-a013-4e3cb10eaa0b")
public class Parallel extends Feature {
    @objid ("45a11636-3748-4faa-a9c8-ae362e1713d4")
    public static final String STEREOTYPE_NAME = "Parallel";

    /**
     * Tells whether a {@link Parallel proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Parallel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7ae4f9f3-03d1-4322-a0b1-533d0273ebfc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Parallel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Parallel >> then instantiate a {@link Parallel} proxy.
     * 
     * @return a {@link Parallel} proxy on the created {@link Constraint}.
     */
    @objid ("e2546c10-9332-4460-b28d-7eb02564f094")
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
    @objid ("2f3c98f3-b13c-4f0f-ab9f-a2fe181288f6")
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
    @objid ("0b26f654-27f7-420e-9ee0-2b4f798def3f")
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
    @objid ("8e0b8114-78ed-4be2-9e4e-83b6d2b839eb")
    public void addComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Parallel.MdaTypes.MDAASSOCDEP);
            d.setName("components");
            d.putTagValue(Parallel.MdaTypes.MDAASSOCDEP_ROLE, "components");
        }
    }

    @objid ("8612434f-54ab-4c2b-bc35-b9dbc2c37f15")
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
    @objid ("7cd57ad6-2f4a-479d-9f39-ddbfc48325ab")
    public List<SoftwareComponent> getComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(Parallel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Parallel.MdaTypes.MDAASSOCDEP_ROLE), "components")){
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
    @objid ("6e168ebb-74b8-47dd-89fd-d746a4bf296b")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("19433f3d-60f8-4ea9-a01f-9ee62eb25bba")
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
    @objid ("4cad5f86-e398-4d86-b22e-a4536cbb45d7")
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

    @objid ("ed12d2d7-0053-418b-983e-446bed9fc016")
    protected Parallel(final Constraint elt) {
        super(elt);
    }

    @objid ("61ad9a2f-bd68-4162-9f04-63222d5fce49")
    public static final class MdaTypes {
        @objid ("7d418bc8-2ffd-4f50-9053-821dace1c932")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("726ea1bd-f0e6-4cfe-9a60-84a60d5fe0a6")
        private static Stereotype MDAASSOCDEP;

        @objid ("320a3f75-1189-4ea8-bff3-30d41b5f72d8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("effd4b9e-c63a-4c04-bcaf-1f67738bdda7")
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
