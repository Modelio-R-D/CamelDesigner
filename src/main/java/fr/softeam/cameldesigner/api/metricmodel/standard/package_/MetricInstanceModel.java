/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("789b5f79-a15e-46bb-aa06-79842596042a")
    public static final String STEREOTYPE_NAME = "MetricInstanceModel";

    /**
     * Tells whether a {@link MetricInstanceModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricInstanceModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d43a8c5a-c0bd-4105-8153-9949ea0713c5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstanceModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetricInstanceModel >> then instantiate a {@link MetricInstanceModel} proxy.
     * 
     * @return a {@link MetricInstanceModel} proxy on the created {@link Package}.
     */
    @objid ("31d7b731-f0a9-4320-a3aa-be5359e9eafe")
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
    @objid ("d2a1b0c9-c747-497c-8d4e-ecdb04619952")
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
    @objid ("469e590a-618f-4510-af85-650956219fe8")
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
    @objid ("7e77f7d2-515f-40e1-9c6d-66a6d870d42d")
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
    @objid ("26020a57-cbb3-4751-8a17-4d2712bafc6a")
    public void addMetricInstances(final MetricInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    @objid ("9a36adc6-15d1-4346-96b9-9bb215cc573a")
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
    @objid ("89afef57-06fc-425b-9d40-d0538afe96be")
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
    @objid ("98720405-bdb5-4391-be13-6c067958e310")
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
    @objid ("6922a7cd-4646-4bc6-aae7-9b585e0340ca")
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
    @objid ("36cbad23-5997-4f8b-b171-e63cbbe95491")
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

    @objid ("8fc19725-b37f-4268-9575-62bcdf67cc80")
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
    @objid ("37326e0d-e746-4956-a3cc-31013747c7bd")
    public boolean removeBindings(final MetricObjectBinding obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d2634314-a0ca-4ef0-a3b0-9314de611a3f")
    public boolean removeMetricInstances(final MetricInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fd9b899e-6231-4474-a2f7-cda2aebb5670")
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

    @objid ("a05b689d-39c1-415f-be6a-6ac840a20913")
    protected MetricInstanceModel(final Package elt) {
        super(elt);
    }

    @objid ("f50c0e56-9674-4958-8a3c-cef476fee649")
    public static final class MdaTypes {
        @objid ("5fe16321-1298-4a8e-ad4e-adbfdc659dd2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3a5d6a63-7fcd-4c43-b52b-1542bdbee277")
        private static Stereotype MDAASSOCDEP;

        @objid ("3c8c5a10-3c40-4b74-8500-b0104b6cedc3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ab7ca00f-6828-4a4a-96ea-d22d87f12c68")
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
