/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("c235c689-1760-43d7-a8b2-ccd2ded72d05")
    public static final String STEREOTYPE_NAME = "MeasurableAttribute_Instance";

    /**
     * Tells whether a {@link MeasurableAttributeInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MeasurableAttribute_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9e1da942-1721-4eb2-ac07-f4c917c8d1de")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MeasurableAttribute_Instance >> then instantiate a {@link MeasurableAttributeInstance} proxy.
     * 
     * @return a {@link MeasurableAttributeInstance} proxy on the created {@link Instance}.
     */
    @objid ("37ed5298-43d7-4dac-8e7a-b311ec068882")
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
    @objid ("3a73a295-d447-499b-955d-dc15930af427")
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
    @objid ("2f3bffb7-5ad9-405b-adef-985fc9c14553")
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
    @objid ("54768cf4-83bc-414f-9a13-40631a49e818")
    public void addSensors(final Sensor obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP);
            d.setName("sensors");
            d.putTagValue(MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP_ROLE, "sensors");
        }
    }

    @objid ("eaffc3c8-7672-4d2a-97ff-d7b8bb294d2a")
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
    @objid ("14cd1801-09d4-4cd7-9a3a-8c1ab4caecd1")
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
    @objid ("8aa8c7d9-1cd0-4aa5-886d-1fecd07a00c5")
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

    @objid ("f74a910d-4eab-47eb-908d-70b29c5cf18e")
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
    @objid ("cd64fefd-2e82-444b-ba6f-fe2056fc3bcf")
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

    @objid ("c7cc0381-136c-4fff-a175-612711922c8f")
    protected MeasurableAttributeInstance(final Instance elt) {
        super(elt);
    }

    @objid ("9b87b896-0774-41c7-9ed8-14db2e722c5f")
    public static final class MdaTypes {
        @objid ("9764cf44-9996-4705-9027-9d7cef50a783")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("393a2ff0-b312-4748-92d5-2d49c188bc0f")
        private static Stereotype MDAASSOCDEP;

        @objid ("8d3a8948-f587-4067-9073-82c54b07a1b2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d9371e1c-07c0-44cd-9fb0-7c940c3edef6")
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
