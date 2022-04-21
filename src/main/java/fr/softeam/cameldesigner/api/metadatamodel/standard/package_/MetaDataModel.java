/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("40dbc6e6-41bb-40e8-8d32-e96a241cc39e")
    public static final String STEREOTYPE_NAME = "MetaDataModel";

    /**
     * Tells whether a {@link MetaDataModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetaDataModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("434b17fb-087c-434f-9ec0-12bd70ec87ef")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetaDataModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetaDataModel >> then instantiate a {@link MetaDataModel} proxy.
     * 
     * @return a {@link MetaDataModel} proxy on the created {@link Package}.
     */
    @objid ("4b933e43-a9da-4a7d-a26e-b6406fc023da")
    public static MetaDataModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetaDataModel.STEREOTYPE_NAME);
        return MetaDataModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link MetaDataModel} proxy from a {@link Package} stereotyped << MetaDataModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link MetaDataModel} proxy or <i>null</i>.
     */
    @objid ("32e078ba-ce99-408b-a296-8c3b261c7748")
    public static MetaDataModel instantiate(final Package obj) {
        return MetaDataModel.canInstantiate(obj) ? new MetaDataModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetaDataModel} proxy from a {@link Package} stereotyped << MetaDataModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link MetaDataModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("20ecd783-65d8-4d2c-8034-0c8cadda09b2")
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
     */
    @objid ("aa24a7d2-d6ed-44b9-b786-28ae895952b8")
    public void addConcept(final MmsConcept obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'conceptInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("6d687b44-8ca0-4d88-9fca-85bebdd720b0")
    public void addConceptInstance(final MmsConceptInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    @objid ("9d24e3f3-0152-4d90-a5eb-c9900c4b0a57")
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
     */
    @objid ("6cb6c162-d43c-4e65-bc48-dd69f64a044b")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'concept' role.<p>
     * Role description:
     * null
     */
    @objid ("18581616-d926-455c-b504-ab02bf476063")
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
     */
    @objid ("48dd9b19-e3e7-481e-b8c7-ee0f391e6f8a")
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
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("ed63d0da-6620-4d43-96bc-50924c4b8c48")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("0017b773-2e29-4d74-85a2-260f036cf3ee")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'concept' role.<p>
     * Role description:
     * null
     */
    @objid ("fa9a8ad0-70b5-45f6-a8a7-38dff769103d")
    public boolean removeConcept(final MmsConcept obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'conceptInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("4da67c32-3504-4ea3-bba5-de149faf27ae")
    public boolean removeConceptInstance(final MmsConceptInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     */
    @objid ("b0af260b-22c9-441f-a9ca-a967a087ac69")
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

    @objid ("63c0d126-e0d0-4710-8db9-f95f4728b12d")
    protected MetaDataModel(final Package elt) {
        super(elt);
    }

    @objid ("dcdbd03e-a04b-4330-976d-64d85bfa5c03")
    public static final class MdaTypes {
        @objid ("95c1da0f-ee23-4228-a7dd-06cb9986647e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9d909f42-c834-4bbb-b8ef-158530adcf8a")
        private static Stereotype MDAASSOCDEP;

        @objid ("fd8e64dc-1ad5-493f-be4c-51705c62c1ce")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b1d96ab4-ad8e-42d7-b120-68aad7f14c6c")
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
