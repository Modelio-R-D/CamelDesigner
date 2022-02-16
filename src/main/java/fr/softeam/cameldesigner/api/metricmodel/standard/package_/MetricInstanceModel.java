/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << MetricInstanceModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fc62e562-4151-4b10-80da-5289e792c7a8")
public class MetricInstanceModel extends MetricModel {
    @objid ("60d650fd-8e72-4f07-80bd-757626127353")
    public static final String STEREOTYPE_NAME = "MetricInstanceModel";

    /**
     * Tells whether a {@link MetricInstanceModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricInstanceModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("76226313-891e-47af-b9ae-8eeb0e04507c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstanceModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetricInstanceModel >> then instantiate a {@link MetricInstanceModel} proxy.
     * 
     * @return a {@link MetricInstanceModel} proxy on the created {@link Package}.
     */
    @objid ("d4b41758-d31b-4167-a599-fe21639e8f0f")
    public static MetricInstanceModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricInstanceModel.STEREOTYPE_NAME);
        return MetricInstanceModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link MetricInstanceModel} proxy from a {@link Package} stereotyped << MetricInstanceModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link MetricInstanceModel} proxy or <i>null</i>.
     */
    @objid ("b2aad417-b2f1-4bd7-a736-40c5e19e8da8")
    public static MetricInstanceModel instantiate(final Package obj) {
        return MetricInstanceModel.canInstantiate(obj) ? new MetricInstanceModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricInstanceModel} proxy from a {@link Package} stereotyped << MetricInstanceModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link MetricInstanceModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c05801bb-3e26-4ba6-a9b3-ce46783f73bd")
    public static MetricInstanceModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (MetricInstanceModel.canInstantiate(obj))
        	return new MetricInstanceModel(obj);
        else
        	throw new IllegalArgumentException("MetricInstanceModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'bindings' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cd92a169-5447-40d6-b4ac-2f6480445b73")
    public void addBindings(final MetricObjectBinding obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'metricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7f1c5e7e-ccbf-4706-bc16-6d18b0b924ca")
    public void addMetricInstances(final MetricInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    @objid ("7447d94f-ce52-4e22-af7e-044280cbb6fe")
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
        MetricInstanceModel other = (MetricInstanceModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'bindings' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("15b318a0-bf06-4b4f-9ad4-4509a863f592")
    public List<MetricObjectBinding> getBindings() {
        List<MetricObjectBinding> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (MetricObjectBinding.canInstantiate(mObj))
        			results.add((MetricObjectBinding)CamelDesignerProxyFactory.instantiate(mObj, MetricObjectBinding.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("383ad6b0-3b84-4416-a139-2ea8a53a46a0")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'metricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("190b24c0-a85d-4807-9222-d373fbdeeeb2")
    public List<MetricInstance> getMetricInstances() {
        List<MetricInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (SecurityMetricInstance.canInstantiate(mObj))
        			results.add((SecurityMetricInstance)CamelDesignerProxyFactory.instantiate(mObj, SecurityMetricInstance.STEREOTYPE_NAME));
        	if (MetricInstance.canInstantiate(mObj))
        			results.add((MetricInstance)CamelDesignerProxyFactory.instantiate(mObj, MetricInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d5bc6b43-d212-492e-bb4a-366d3d289de8")
    public MetricTypeModel getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricInstanceModel.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "type")){
                  if (MetricTypeModel.canInstantiate(d.getDependsOn()))
                     return (MetricTypeModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricTypeModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("4a1647b5-65e6-431b-be9b-11820b9f8bcb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'bindings' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4ec13cf0-b1da-4a00-82f6-88756ed244b3")
    public boolean removeBindings(final MetricObjectBinding obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cf1d8a53-6703-4361-a7d1-865d91deeb33")
    public boolean removeMetricInstances(final MetricInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("26a2764e-d314-4373-abe5-c1e87cad0ada")
    public void setType(final MetricTypeModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricInstanceModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "type")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricInstanceModel.MdaTypes.MDAASSOCDEP);
              dep.setName("type");      dep.putTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE, "type");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("cce94c34-a232-486c-b50c-ac984da05dcc")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("dd7594b7-fa18-4a04-aeb5-74849fa2ec6d")
    protected MetricInstanceModel(final Package elt) {
        super(elt);
    }

    @objid ("f50c0e56-9674-4958-8a3c-cef476fee649")
    public static final class MdaTypes {
        @objid ("991ae76e-3821-4862-803e-6edf9c1de2a7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e949cd1a-dfaf-4830-b3d4-7c8184faf707")
        private static Stereotype MDAASSOCDEP;

        @objid ("1ab0ac9d-51ff-4aee-b174-1939dec84236")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("80348237-0d8c-4021-90cf-392213242483")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "42ce7273-a709-4cf7-bc51-ac7ee48b9f13");
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
