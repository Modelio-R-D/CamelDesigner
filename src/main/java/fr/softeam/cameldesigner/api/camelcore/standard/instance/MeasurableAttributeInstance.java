/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << MeasurableAttribute_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2794691d-52e1-4349-b451-6571daab6bcf")
public class MeasurableAttributeInstance extends QualityAttributeInstance {
    @objid ("b5dd19ae-5f5f-46e3-b5a7-6ce430dc0f29")
    public static final String STEREOTYPE_NAME = "MeasurableAttribute_Instance";

    /**
     * Tells whether a {@link MeasurableAttributeInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MeasurableAttribute_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("93b54acb-98e1-4871-ab2d-b30e7abe2de4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MeasurableAttribute_Instance >> then instantiate a {@link MeasurableAttributeInstance} proxy.
     * 
     * @return a {@link MeasurableAttributeInstance} proxy on the created {@link Instance}.
     */
    @objid ("dc1477ce-5447-4452-b70a-85c963a6db13")
    public static MeasurableAttributeInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeInstance.STEREOTYPE_NAME);
        return MeasurableAttributeInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link MeasurableAttributeInstance} proxy from a {@link Instance} stereotyped << MeasurableAttribute_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link MeasurableAttributeInstance} proxy or <i>null</i>.
     */
    @objid ("0769d253-fbf7-4790-9139-da228aa1d366")
    public static MeasurableAttributeInstance instantiate(final Instance obj) {
        return MeasurableAttributeInstance.canInstantiate(obj) ? new MeasurableAttributeInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MeasurableAttributeInstance} proxy from a {@link Instance} stereotyped << MeasurableAttribute_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link MeasurableAttributeInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("726837ca-15c3-457a-b269-8958dd9a5a43")
    public static MeasurableAttributeInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (MeasurableAttributeInstance.canInstantiate(obj))
        	return new MeasurableAttributeInstance(obj);
        else
        	throw new IllegalArgumentException("MeasurableAttributeInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9fb62809-8652-493f-ba59-b34445b3fe18")
    public void addSensors(final Sensor obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP);
            d.setName("sensors");
            d.putTagValue(MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP_ROLE, "sensors");
        }
    }

    @objid ("18979b87-f63f-48d3-8918-03beb46eb582")
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
        MeasurableAttributeInstance other = (MeasurableAttributeInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("13c81780-090c-4b20-9166-10ecef1b0763")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the values of the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a23a2b73-fd0d-4f5d-9935-e7d08b1bf319")
    public List<Sensor> getSensors() {
        List<Sensor> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP_ROLE), "sensors")){
              if (Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("690ce1af-3744-444c-a44b-c07f84801189")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d5d9d710-58a1-4e51-811d-71745a5b4d2a")
    public boolean removeSensors(final Sensor obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP_ROLE), "sensors")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("26b5a24d-05ba-4668-87ee-daf8f1e3d026")
    protected MeasurableAttributeInstance(final Instance elt) {
        super(elt);
    }

    @objid ("9b87b896-0774-41c7-9ed8-14db2e722c5f")
    public static final class MdaTypes {
        @objid ("8b838e95-2257-4240-9aba-dc27fab4da50")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5a04c9eb-8874-44e4-ad03-f89202c5baf1")
        private static Stereotype MDAASSOCDEP;

        @objid ("a048fb4a-89f3-44db-8481-fc1232116259")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5c22aa5d-2d7d-4ca2-93af-0a160a183f5f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d6b1b6f6-ccbb-486b-bf73-fc570fe504b9");
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
