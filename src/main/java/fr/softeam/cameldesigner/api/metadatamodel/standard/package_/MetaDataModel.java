/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
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
 * Proxy class to handle a {@link Package} with << MetaDataModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bffe392b-7477-486d-851e-fb774d44120c")
public class MetaDataModel extends SubModel {
    @objid ("0810f10e-add0-47a4-8442-957083d794af")
    public static final String STEREOTYPE_NAME = "MetaDataModel";

    /**
     * Tells whether a {@link MetaDataModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetaDataModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c7b9532f-3d29-40c8-bde3-b70e0d481e0d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetaDataModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetaDataModel >> then instantiate a {@link MetaDataModel} proxy.
     * 
     * @return a {@link MetaDataModel} proxy on the created {@link Package}.
     */
    @objid ("b7d5b86d-9141-430e-ba7a-b0bc57a107a3")
    public static MetaDataModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetaDataModel.STEREOTYPE_NAME);
        return MetaDataModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link MetaDataModel} proxy from a {@link Package} stereotyped << MetaDataModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link MetaDataModel} proxy or <i>null</i>.
     */
    @objid ("32015616-b82b-4f5d-81dd-2cbeac2b5652")
    public static MetaDataModel instantiate(final Package obj) {
        return MetaDataModel.canInstantiate(obj) ? new MetaDataModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetaDataModel} proxy from a {@link Package} stereotyped << MetaDataModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link MetaDataModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c782512b-d76a-4b8b-be46-3f3eec3801e1")
    public static MetaDataModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (MetaDataModel.canInstantiate(obj))
        	return new MetaDataModel(obj);
        else
        	throw new IllegalArgumentException("MetaDataModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'concept' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("14d6b30a-ce70-4d9e-9470-d80059a85f7d")
    public void addConcept(final MmsConcept obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'conceptInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c108b8dd-dca9-40ae-a206-84e5978f69ec")
    public void addConceptInstance(final MmsConceptInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    @objid ("73514234-9a35-4b69-91f4-23531db98bde")
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
        MetaDataModel other = (MetaDataModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("84a01603-36c3-4dea-851c-89d6781fd148")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'concept' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("57fef9f3-b88d-4ffd-aad4-a06cb2bb8e38")
    public List<MmsConcept> getConcept() {
        List<MmsConcept> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (MmsConcept.canInstantiate(mObj))
        			results.add((MmsConcept)CamelDesignerProxyFactory.instantiate(mObj, MmsConcept.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'conceptInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6546074d-75cb-44fa-8dd1-49d926fc2661")
    public List<MmsConceptInstance> getConceptInstance() {
        List<MmsConceptInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (MmsConceptInstance.canInstantiate(mObj))
        			results.add((MmsConceptInstance)CamelDesignerProxyFactory.instantiate(mObj, MmsConceptInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("93a65ca9-ec0b-4575-a486-2e359522b82e")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("631e84b0-338b-4fae-8458-53d260ceb500")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'concept' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a11f285e-1199-4a3a-8c8c-b9da4b84fbb8")
    public boolean removeConcept(final MmsConcept obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'conceptInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ff03cd0e-c62c-48ae-9677-2ae47a34d0cd")
    public boolean removeConceptInstance(final MmsConceptInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("aa01522f-0e05-48b3-b33d-4ea7b224e94e")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("4019d879-5c8e-41e5-9ae9-31509e486e55")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getConcept());
        result.addAll(getConceptInstance());
        return result;
    }

    @objid ("eedb10e4-44fb-411f-aa26-bf3b709484a0")
    protected MetaDataModel(final Package elt) {
        super(elt);
    }

    @objid ("dcdbd03e-a04b-4330-976d-64d85bfa5c03")
    public static final class MdaTypes {
        @objid ("3e114427-bc8d-4325-8457-b3e5a40d3a19")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("06ec2eab-28f6-45a9-9b94-7963104465a8")
        private static Stereotype MDAASSOCDEP;

        @objid ("8365eb10-4bc8-4d98-ace6-4ff61b042d9b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e7ffd013-4adb-455b-85cc-d97ff68b7a6a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "73200409-c934-45d3-b418-8d71c00e7382");
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
