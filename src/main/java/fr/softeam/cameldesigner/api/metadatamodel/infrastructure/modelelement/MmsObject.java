/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << MmsObject >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5b8e0066-83d4-4b26-bada-7dcae35d5e7d")
public abstract class MmsObject extends NamedElement {
<<<<<<< HEAD
    @objid ("c3a47c9c-54e8-453f-a9ad-9418138f3c9f")
    public static final String STEREOTYPE_NAME = "MmsObject";

    @objid ("56249430-5a7f-44e4-89c8-33cf24fff887")
    public static final String ID_TAGTYPE = "id";

    @objid ("b8cac343-5f21-4b1e-b33d-1a1ddf8d6a1b")
    public static final String IMPLEMENTED_TAGTYPE = "implemented";

    @objid ("714fab1d-38ae-4ceb-92ae-7cbb49a7773f")
=======
    @objid ("8693b530-473e-4613-8c4b-3d57e1f9c487")
    public static final String STEREOTYPE_NAME = "MmsObject";

    @objid ("a8e2def4-37a9-445f-8e14-b37cc8263cc4")
    public static final String ID_TAGTYPE = "id";

    @objid ("dd5b231f-965a-4310-8fc6-68dfa14fb774")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String URI_TAGTYPE = "uri";

    /**
     * Tells whether a {@link MmsObject proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << MmsObject >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("4986e74b-6783-4c28-be0a-0a2f8182fc96")
=======
    @objid ("5c24f9c2-02dc-40e7-9e71-db16a10236c6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsObject.STEREOTYPE_NAME));
    }

    @objid ("279386c6-8a35-498a-9c8a-980cd5eb2e29")
    public static MmsObject instantiate(final ModelElement obj) {
        return MmsProperty.canInstantiate(obj) ?  MmsProperty.instantiate((Attribute)obj) :
            MmsConcept.canInstantiate(obj) ?  MmsConcept.instantiate((Class)obj) :
                MmsConceptInstance.canInstantiate(obj) ?  MmsConceptInstance.instantiate((Instance)obj) :
                    MmsPropertyInstance.canInstantiate(obj) ?  MmsPropertyInstance.instantiate((AttributeLink)obj) : null;
    }

<<<<<<< HEAD
    @objid ("5c726870-6409-4826-8da8-bd4dd0e54f41")
=======
    @objid ("0281858c-4e88-4999-9e73-8aa5dc89f14c")
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
        MmsObject other = (MmsObject) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("f62936ca-cc93-496d-a08e-8ac0e47ff9b3")
=======
    @objid ("130f47a8-fef4-4c20-9c77-9c12a4694761")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("e79231d3-04dd-4f8e-9fa4-f3b3a3634535")
=======
    @objid ("d4d9adc6-e4f3-4caf-8bc8-89bfb24b5490")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getId() {
        return this.elt.getTagValue(MmsObject.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'uri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("097089b5-f1bd-49db-95c2-d1818dbfea7f")
=======
    @objid ("e7197a96-80d4-4688-adc8-82868068a2df")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getUri() {
        return this.elt.getTagValue(MmsObject.MdaTypes.URI_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("1f5b1ce4-1e33-43cc-afbf-37fd46a4e2f9")
=======
    @objid ("ac866ecb-9aee-4d48-a492-a563159403a2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'implemented'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b17e869f-40a7-4a3b-8b64-57bb9585bacb")
    public boolean isImplemented() {
        return this.elt.isTagged(MmsObject.MdaTypes.IMPLEMENTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("2aa0fd3a-23f2-4366-9bd7-f64cc2bfb7d2")
=======
    @objid ("e6fa3828-e7c2-4883-b5e7-80078516eaa6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setId(final String value) {
        this.elt.putTagValue(MmsObject.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'implemented'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("82b6a4ce-bd3a-495f-b1de-72905d9ac7df")
    public void setImplemented(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(MmsObject.MdaTypes.IMPLEMENTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(MmsObject.MdaTypes.IMPLEMENTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'uri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("9386265a-2dc4-4782-82a2-96826687ed5c")
=======
    @objid ("3876b0a1-d870-44ee-84d0-87af060d5124")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setUri(final String value) {
        this.elt.putTagValue(MmsObject.MdaTypes.URI_TAGTYPE_ELT, value);
    }

    @objid ("eba83ee7-f370-4b14-8163-eb080b29b872")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("d06c5aab-a19d-4f29-8faf-96a06351e293")
=======
    @objid ("8b491a18-cc85-42f4-aece-24ce78de028d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected MmsObject(final ModelElement elt) {
        super(elt);
    }

    @objid ("2f90ab01-c906-4902-9288-e931e22fb14d")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("932858e6-e45d-401e-91d3-7a59b3a20865")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9b656db4-7aac-48df-947a-7e2dfd281d21")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("9226767d-a1a7-4f7e-907f-08e784c922db")
        public static TagType URI_TAGTYPE_ELT;

        @objid ("6b10e709-7c97-4324-9483-379908c5ad19")
        public static TagType IMPLEMENTED_TAGTYPE_ELT;

        @objid ("252a257f-b808-488d-8a63-fc99af8df017")
        private static Stereotype MDAASSOCDEP;

        @objid ("c5798edb-8a58-4ac5-824f-70e3e5b37855")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("68327eff-5cb2-4a9c-b841-f4eb11a5d170")
=======
        @objid ("28a3d284-44c8-4ab6-845f-371e22bc96ec")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d347224d-1f0d-42f6-9d4c-8ca4f271dae9")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("ea7285cb-747b-401a-8a71-64a7a5f81fe9")
        public static TagType URI_TAGTYPE_ELT;

        @objid ("91df1073-3ebf-4ef4-8b1d-c99b0000736c")
        private static Stereotype MDAASSOCDEP;

        @objid ("dc8088e1-5556-406a-9469-763142c94a98")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("143640a3-fc19-413f-b745-2f0dc32e0df9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "907f72a5-eb52-4908-953e-7f9a66b9939d");
            ID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a139c9cf-4b74-454a-b4cd-b0363a008c40");
            URI_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5cff0fda-7e85-46ea-af8b-de500c800a21");
            IMPLEMENTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ab13b830-a142-4532-b79b-6d25b71242e0");
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
