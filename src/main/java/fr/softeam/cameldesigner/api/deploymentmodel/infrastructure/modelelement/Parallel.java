/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement;

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
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << Parallel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4c244d09-57a9-4a83-bf17-30176a65e25c")
public class Parallel extends Feature {
    @objid ("43384855-4dcd-434e-8818-29efab25417f")
    public static final String STEREOTYPE_NAME = "Parallel";

    /**
     * Tells whether a {@link Parallel proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << Parallel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1a7cc374-f100-432b-a69c-fb635079fa29")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Parallel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << Parallel >> then instantiate a {@link Parallel} proxy.
     * 
     * @return a {@link Parallel} proxy on the created {@link ModelElement}.
     */
    @objid ("351e1dfb-150a-4202-b8e0-6eafa13ed6fb")
    public static Parallel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Parallel.STEREOTYPE_NAME);
        return Parallel.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link Parallel} proxy from a {@link ModelElement} stereotyped << Parallel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link Parallel} proxy or <i>null</i>.
     */
    @objid ("1feeab75-1a98-4a33-b927-a323bb2053ef")
    public static Parallel instantiate(final ModelElement obj) {
        return Parallel.canInstantiate(obj) ? new Parallel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Parallel} proxy from a {@link ModelElement} stereotyped << Parallel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link Parallel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("337de868-38f1-42c8-a4e8-8c89fc15cef6")
    public static Parallel safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
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
    @objid ("04aba542-4ea7-4fbf-b3ca-89d1b84fc82f")
    public void addComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Parallel.MdaTypes.MDAASSOCDEP);
            d.setName("components");
            d.putTagValue(Parallel.MdaTypes.MDAASSOCDEP_ROLE, "components");
        }
    }

    @objid ("d3358497-85a7-4f4b-a001-d8777b6b3e0b")
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
    @objid ("c483b35b-7e8d-4ae8-bf24-282efbd5d03e")
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
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("eb9870cf-fa64-494d-8514-bdbdeb01c274")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("eee87ba3-a1e7-442d-b5aa-960b66116792")
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
    @objid ("a80c9e7e-19c8-4b30-923c-e99a932ea773")
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

    @objid ("eb9fe059-9b69-4f96-b72f-8f66f33b1e37")
    protected Parallel(final ModelElement elt) {
        super(elt);
    }

    @objid ("0e0eaff4-fbfa-4eff-bde8-1b82a6b4da65")
    public static final class MdaTypes {
        @objid ("d37da52a-f291-4cd2-b4d0-555c1df09d95")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("17d8fe20-0095-4a1e-8fa5-9fb54bfb7070")
        private static Stereotype MDAASSOCDEP;

        @objid ("c65e4e29-9c27-4f70-9eb1-3f952da5a2e8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("68ed10b2-e5bc-42eb-9657-478a1de7e15c")
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
