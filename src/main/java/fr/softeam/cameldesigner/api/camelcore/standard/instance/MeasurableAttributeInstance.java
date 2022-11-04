/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("0e9d10ba-a70d-4ae5-a1d2-c1ec71ace5bf")
    public static final String STEREOTYPE_NAME = "MeasurableAttribute_Instance";

    /**
     * Tells whether a {@link MeasurableAttributeInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MeasurableAttribute_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f90c66d7-b4e4-474d-98ca-74d27e5dc973")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MeasurableAttribute_Instance >> then instantiate a {@link MeasurableAttributeInstance} proxy.
     * 
     * @return a {@link MeasurableAttributeInstance} proxy on the created {@link Instance}.
     */
    @objid ("740c4495-a929-4dc0-8e29-070d3c421779")
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
    @objid ("44ee1972-a1b1-4d5e-b752-21397abb89b1")
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
    @objid ("17c4517a-55e2-4cae-976a-f5b93e675951")
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
    @objid ("2231e6f4-acba-4361-a6b2-e775937bb3cc")
    public void addSensors(final Sensor obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP);
            d.setName("sensors");
            d.putTagValue(MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP_ROLE, "sensors");
        }
    }

    @objid ("c0838815-8355-4d82-b81e-516f0449b341")
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
    @objid ("a4b5e7d2-6c5b-4f5e-9738-b18342481e45")
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
    @objid ("f29e8006-feb4-4b6b-87c9-7b3c31e5d4c0")
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

    @objid ("67f17df4-5f23-4896-930f-d3e5da061733")
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
    @objid ("575b47fc-66c6-4325-b008-550f7fc28110")
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

    @objid ("12fbe941-5963-4291-846a-ff2d18685e71")
    protected MeasurableAttributeInstance(final Instance elt) {
        super(elt);
    }

    @objid ("9b87b896-0774-41c7-9ed8-14db2e722c5f")
    public static final class MdaTypes {
        @objid ("42d6c51b-22f0-4477-9961-3c4bbce2c690")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("50673a36-232a-4584-85f6-cfee2760363c")
        private static Stereotype MDAASSOCDEP;

        @objid ("70a04fc4-eb3d-4394-bb7a-16e168b1cd20")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2b2e4ab2-d869-4af9-be8b-297c64268fd3")
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
