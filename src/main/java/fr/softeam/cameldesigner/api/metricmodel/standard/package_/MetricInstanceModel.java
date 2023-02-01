/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricInstanceModelDiagram;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
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
<<<<<<< HEAD
    @objid ("9c11ba99-d8e6-40ae-86c1-01d8fcdc82e2")
=======
    @objid ("4780a41d-245c-4e18-b1a8-d8c2039cbcad")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "MetricInstanceModel";

    /**
     * Tells whether a {@link MetricInstanceModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricInstanceModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("795b8752-7ab0-456d-99a0-a0ac8627a27f")
=======
    @objid ("5d76a961-d3bf-4108-a047-da59f2e04ef6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstanceModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetricInstanceModel >> then instantiate a {@link MetricInstanceModel} proxy.
     * 
     * @return a {@link MetricInstanceModel} proxy on the created {@link Package}.
     */
<<<<<<< HEAD
    @objid ("1ebd4889-f4de-4b2a-a9b2-5ceec16d9eb6")
=======
    @objid ("2d489cc2-20b3-4c65-8837-fac8e944bb90")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("59c96728-72fb-4ab9-93fa-704f8d40aafb")
=======
    @objid ("5c97b306-a3ce-4e11-ad10-460940d2dcdd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("9b625382-b987-4d03-b74f-8d3f11f33336")
=======
    @objid ("9b2d4d90-f183-45f0-9856-41e45634a480")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("4a3f1645-d592-4742-a033-aab4a53f51ab")
=======
    @objid ("dfcbd9e0-cbce-414f-af9e-899fba3bdbc3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addBindings(final MetricObjectBinding obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("aede7daa-7aa0-49ea-88b3-4ee684c10ea1")
=======
    @objid ("0cc48b22-6fd9-4f54-874b-7754793d5f84")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDiagrams(final MetricInstanceModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'metricInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("48e30413-ae56-411e-9c96-774a9db48d43")
=======
    @objid ("01e69d44-e8ee-4b30-95a1-257f50141610")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addMetricInstances(final MetricInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("e5bef2e8-4bda-48e1-a787-fb4873be2be4")
=======
    @objid ("39f9757f-b9b0-4df2-8c99-aff7fba0e963")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1571b780-e1f3-4071-90fa-8410a93ab66c")
=======
    @objid ("08048b32-2d1a-48ce-be2e-a2b24580f57a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<MetricObjectBinding> getBindings() {
        List<MetricObjectBinding> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (MetricObjectBinding.canInstantiate(mObj))
        			results.add((MetricObjectBinding)CamelDesignerProxyFactory.instantiate(mObj, MetricObjectBinding.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("360d96c7-b5c4-4f17-bc96-03fac3e4553e")
=======
    @objid ("138c24c7-41c6-4fdf-a36c-db5f5ce6f464")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<MetricInstanceModelDiagram> getDiagrams() {
        List<MetricInstanceModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (MetricInstanceModelDiagram.canInstantiate(mObj))
        			results.add((MetricInstanceModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, MetricInstanceModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("0063626a-0d04-4d08-855b-eccbe741062d")
=======
    @objid ("7ff8207f-b54b-450c-b7dc-da2afaf55494")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e8d88248-04d4-4808-afe0-7bbe7c146be1")
=======
    @objid ("29d22184-4c3d-43ea-ada5-c604a1298039")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c9640a61-818d-4e56-9628-ea1d78a98030")
=======
    @objid ("ce17d584-13c3-4871-bdd0-974f88867c09")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("f6b34bb6-9d7e-412f-86f3-ec482c47eea3")
=======
    @objid ("9fe2c903-0bcb-43cd-9260-46cd83195b4b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("cebf5ee5-e371-4c15-88f7-3d1530518611")
=======
    @objid ("cad16e46-417b-48c0-b16e-e7f168ce5a16")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeBindings(final MetricObjectBinding obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("6e083d33-ba0d-4c68-9d7c-0248caebc7e6")
=======
    @objid ("192a538b-852d-4116-8e5b-50061dcd5253")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDiagrams(final MetricInstanceModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("fb57d5b4-f661-4502-8f70-e2e78161c420")
=======
    @objid ("2608b9db-9076-411b-ab27-a395382faa24")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeMetricInstances(final MetricInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("6868f7e0-59ce-4a98-b86d-d1f461544c4e")
=======
    @objid ("7f75d5b9-aaad-4e3f-bc3c-5697fa56595f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("6d2b8105-b796-45ac-827e-236d9c562149")
=======
    @objid ("b6ffd1dd-d59d-4313-a030-72d37581ba1a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected MetricInstanceModel(final Package elt) {
        super(elt);
    }

    @objid ("f50c0e56-9674-4958-8a3c-cef476fee649")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("65a6b30b-140b-49fc-ae21-97c1dfbed656")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("67e8a5cc-c030-4198-a534-4c8d31610b03")
        private static Stereotype MDAASSOCDEP;

        @objid ("16378449-1f66-4126-8940-d2517705ca13")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3b6e4380-acc7-454d-9f99-b8029d89cf0b")
=======
        @objid ("f7e7e1d4-bd2f-4f4b-9eb5-cbce066de99b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c22aadab-d436-4c6c-85c7-837128717cee")
        private static Stereotype MDAASSOCDEP;

        @objid ("851b63f6-789f-49f2-8d12-7fd50d0a63f8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0612fd46-fe80-4861-9c1f-527c295507fc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
