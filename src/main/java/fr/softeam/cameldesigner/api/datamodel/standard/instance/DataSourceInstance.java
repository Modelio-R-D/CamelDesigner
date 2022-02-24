/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.datamodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
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
 * Proxy class to handle a {@link Instance} with << DataSourceInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7596aa7f-0bb2-4518-8c82-6822a15475d0")
public class DataSourceInstance extends FeatureInstance {
    @objid ("d6169803-8637-49b2-8450-3510524965ae")
    public static final String STEREOTYPE_NAME = "DataSourceInstance";

    /**
     * Tells whether a {@link DataSourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << DataSourceInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ebffd9da-d829-44df-8f4b-ffa2fad0d6e5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataSourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << DataSourceInstance >> then instantiate a {@link DataSourceInstance} proxy.
     * 
     * @return a {@link DataSourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("c6ffb258-1665-41c9-ad83-e38c0f7af1df")
    public static DataSourceInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataSourceInstance.STEREOTYPE_NAME);
        return DataSourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link DataSourceInstance} proxy from a {@link Instance} stereotyped << DataSourceInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link DataSourceInstance} proxy or <i>null</i>.
     */
    @objid ("6f6aca90-9101-419d-851f-9fdfde92e2c8")
    public static DataSourceInstance instantiate(final Instance obj) {
        return DataSourceInstance.canInstantiate(obj) ? new DataSourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataSourceInstance} proxy from a {@link Instance} stereotyped << DataSourceInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link DataSourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ccc5474b-1355-43b6-a531-c346ecc4c135")
    public static DataSourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (DataSourceInstance.canInstantiate(obj))
        	return new DataSourceInstance(obj);
        else
        	throw new IllegalArgumentException("DataSourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ababeaca-1c9b-4a79-8cf9-ae054920f8ab")
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
        DataSourceInstance other = (DataSourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("da595e37-d286-4d59-a99e-ee60578905a6")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("943fe5b6-c5dd-41fc-b3e5-61e67e5a0514")
    public DataInstanceModel getParent() {
        return (DataInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DataInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'softwareComponentInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b022b6ea-ac5c-4b8b-8ec5-32a4e28a8c41")
    public SoftwareComponentInstance getSoftwareComponentInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DataSourceInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DataSourceInstance.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponentInstance")){
                  if (SoftwareComponentInstance.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponentInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponentInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a5b957a1-6a2a-4a6c-a5e8-f24d20bd5d2f")
    public DataSource getType() {
        return (DataSource)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), DataSource.STEREOTYPE_NAME);
    }

    @objid ("5baad1e2-2898-4767-92bd-2dc134a3313b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("67b1b7d5-f354-4fc2-8675-cbd2381762b1")
    public void setParent(final DataInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'softwareComponentInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3c07f32d-6a2d-4e74-9090-7d4d5c201417")
    public void setSoftwareComponentInstance(final SoftwareComponentInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(DataSourceInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataSourceInstance.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponentInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), DataSourceInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("softwareComponentInstance");      dep.putTagValue(DataSourceInstance.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponentInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7460c117-496b-4517-abee-052c0015e585")
    public void setType(final DataSource obj) {
        ((Instance) this.elt).setBase((obj != null) ? obj.getElement() : null);
    }

    @objid ("bb97ce67-1add-4095-86f2-6ed1c2d1641b")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("e1a2263e-cf65-4e8a-b89a-65166a6af240")
    protected DataSourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("f274074b-7683-49b4-b45f-098faac6eaa7")
    public static final class MdaTypes {
        @objid ("76d4db53-a418-4ed3-a4e1-3bff1a7de391")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("514f5d59-419a-4058-9275-905d4c115e55")
        private static Stereotype MDAASSOCDEP;

        @objid ("aecf7321-a508-4648-88ba-3384a8da24a9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e80b120f-ef30-441a-b8f6-38df5c0c3d87")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b72705cc-1db6-46cb-8f6e-de0c711a1997");
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
