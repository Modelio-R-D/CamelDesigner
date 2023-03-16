/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetadataModelDiagram;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
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
 * Proxy class to handle a {@link Package} with << MetaDataModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bffe392b-7477-486d-851e-fb774d44120c")
public class MetaDataModel extends SubModel {
    @objid ("5b0db9d9-6cd9-45d3-91dd-b1c1cb334d15")
    public static final String STEREOTYPE_NAME = "MetaDataModel";

    /**
     * Tells whether a {@link MetaDataModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetaDataModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("adde93e8-3706-4d13-a0d4-464f379d8f7b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetaDataModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetaDataModel >> then instantiate a {@link MetaDataModel} proxy.
     * 
     * @return a {@link MetaDataModel} proxy on the created {@link Package}.
     */
    @objid ("6a9114f2-0b37-427f-b2be-d9fd21c3282c")
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
    @objid ("d96e5d71-3d57-495e-b20e-251e8b8f624d")
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
    @objid ("d4fa89fc-f80f-43df-8ba6-1e475c54db8a")
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
    @objid ("9647e6d1-cab8-4ea3-a2fc-0fbd5b077a88")
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
    @objid ("727c5205-5515-4ae7-a335-b7ff6be35e85")
    public void addConceptInstance(final MmsConceptInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e3592dd0-f1d2-4193-a0ec-9cbbf9961b31")
    public void addDiagrams(final MetadataModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    @objid ("d4a66817-c4c8-4104-92fd-4f7ab09982cb")
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
    @objid ("94c6994d-3579-4755-910c-49dab9c66077")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'concept' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a2772a2c-0be1-4997-8665-a79f4351a1b1")
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
    @objid ("b6a15f4d-dd51-4129-b5a2-1d237b9e69c4")
    public List<MmsConceptInstance> getConceptInstance() {
        List<MmsConceptInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (MmsConceptInstance.canInstantiate(mObj))
        			results.add((MmsConceptInstance)CamelDesignerProxyFactory.instantiate(mObj, MmsConceptInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ddd31b23-7b40-4590-8ad4-686976d2d64a")
    public List<MetadataModelDiagram> getDiagrams() {
        List<MetadataModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (MetadataModelDiagram.canInstantiate(mObj))
        			results.add((MetadataModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, MetadataModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("e4aa3ab9-3d93-49f1-9954-657e428d81d1")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("c535b00f-7e3b-4530-8f4d-f388d4de0a0a")
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
    @objid ("097cd59f-3952-4ac9-9fc5-b7369c7398cd")
    public boolean removeConcept(final MmsConcept obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'conceptInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b04d0cef-a482-480e-8e4d-a94af14996e4")
    public boolean removeConceptInstance(final MmsConceptInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("afc47fb4-1677-4d92-92bd-95245d8a2ef3")
    public boolean removeDiagrams(final MetadataModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d2d1b7cc-39d5-4c6d-8933-50cee14dd480")
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

    @objid ("92187364-c878-450b-aaf0-bef323c38a9c")
    protected MetaDataModel(final Package elt) {
        super(elt);
    }

    @objid ("dcdbd03e-a04b-4330-976d-64d85bfa5c03")
    public static final class MdaTypes {
        @objid ("5998296e-3fbe-4517-9d62-3560be2253e7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d0b8071c-ef5d-4cb7-90ed-b78bcb797d53")
        private static Stereotype MDAASSOCDEP;

        @objid ("c263c7eb-75a0-4fc3-ac0d-456ab9799997")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2316d562-4673-4fec-84d6-ddc712656b77")
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
