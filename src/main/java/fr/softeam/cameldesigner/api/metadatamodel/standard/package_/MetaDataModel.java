/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("be1cfd94-9a47-49c2-8d6c-46e7e4380114")
=======
    @objid ("da2e1803-4f9a-4703-8e72-16979279f427")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "MetaDataModel";

    /**
     * Tells whether a {@link MetaDataModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetaDataModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("97b8e3fd-221f-41b6-acd2-4fdf80d1329d")
=======
    @objid ("e477c31f-e731-4fed-9d0d-1df0025d7ebd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetaDataModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetaDataModel >> then instantiate a {@link MetaDataModel} proxy.
     * 
     * @return a {@link MetaDataModel} proxy on the created {@link Package}.
     */
<<<<<<< HEAD
    @objid ("7f561df1-123c-4a9f-8966-cc094fcc3693")
=======
    @objid ("5f4fd7bc-c589-4be3-a810-f947c828c00c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("2dbbb9cb-6fd4-4912-9703-327288db064c")
=======
    @objid ("7da47b63-650e-4ece-be4f-76ee6266175a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("33850ede-3f06-45c7-9337-4fca3359e043")
=======
    @objid ("f5a41ff4-c813-478c-b16a-7c69b9fc3695")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("97e3bf90-3ac0-4313-b819-89339ea46ae8")
=======
    @objid ("54ead941-966f-475d-9f69-b60a0eeb457f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("12762bc7-e310-459a-bfe9-f0434b18dbf7")
=======
    @objid ("0076f6cb-c14d-42a4-a14f-0c9137fe2f00")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("32a94911-d44b-4bb8-85ba-b18986995786")
=======
    @objid ("614d222b-f558-4095-abbe-9691b92bd382")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDiagrams(final MetadataModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("cd9b99dc-b96c-4923-a812-53f038fe6f2e")
=======
    @objid ("ff45936d-dff2-4583-a36d-7965ba45734b")
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
        MetaDataModel other = (MetaDataModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("515b53cc-0c21-411b-bbba-c5f2d16f58d2")
=======
    @objid ("dd5b9603-6128-4130-a4b0-a69a83283a68")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'concept' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("dfc4a4f4-0997-4c10-a7c4-087a4c5963a7")
=======
    @objid ("5e68846a-7237-409c-8f71-284074abf4df")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("13f5a770-7f6b-4d4f-bfe4-3713698e8302")
=======
    @objid ("a4fa6439-d084-4a5e-84e9-f7f57a4b97da")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a5f84667-0bef-48b7-9a55-118ed65d8d55")
=======
    @objid ("d1bb45f1-bce7-4eed-890c-393cf52e1de4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("90c51722-f66a-4267-a4ce-0c45a176b2ca")
=======
    @objid ("75c55977-7ceb-455e-8647-9f50f2313216")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

<<<<<<< HEAD
    @objid ("42a57f6d-5cc9-461c-a0ab-76b3fa48cc09")
=======
    @objid ("ef87851d-2a41-4e8f-ba82-07c7e7f4bb9e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e6c6fed4-d71e-4c92-aec3-270a6599ece9")
=======
    @objid ("970e28d0-add9-4c9b-8bc5-ebd083828dde")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeConcept(final MmsConcept obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'conceptInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("061e15c0-dad8-4661-807b-3f3d3f904d6e")
=======
    @objid ("33c1cfbe-336d-4071-8700-e7529e21ba4b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeConceptInstance(final MmsConceptInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("4e01d48a-0d8d-4a87-b892-9e3b45cac2e3")
=======
    @objid ("24b639e5-bd5f-436c-8b5e-a3b02b6240ee")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDiagrams(final MetadataModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("034d1104-d062-4636-a846-990a1492da4e")
=======
    @objid ("5956758f-85de-4754-a524-6f950fe9addd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("e1e405d6-d303-4d65-bec5-6b62da63726b")
=======
    @objid ("8045e543-6c3c-4148-81fc-a25dd4e1f021")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected MetaDataModel(final Package elt) {
        super(elt);
    }

    @objid ("dcdbd03e-a04b-4330-976d-64d85bfa5c03")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("0e058f82-8f24-4723-ba2b-2681d76c3a4f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5cd0dea4-9702-48e5-8c2b-d24e1a0b677b")
        private static Stereotype MDAASSOCDEP;

        @objid ("a21a2990-a016-4030-9a75-db230f199e84")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ed8c46cd-61bc-45d3-9e10-2090a721ba2c")
=======
        @objid ("7f1e2791-fd4d-406a-81f0-c86b09bb7cca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("86da9e49-c29f-4b37-bd2f-13f37221d36d")
        private static Stereotype MDAASSOCDEP;

        @objid ("1684a128-da35-4c89-80e8-efb0ba101bf7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b5150219-2231-4038-8280-f1c15450c8e3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
