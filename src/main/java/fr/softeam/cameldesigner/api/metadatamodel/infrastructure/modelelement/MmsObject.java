/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("3b86b2e8-aa09-4e6f-8fd1-0fd6a7f7851c")
    public static final String STEREOTYPE_NAME = "MmsObject";

    @objid ("d6457d7a-7761-477f-a01f-ea6a00cfb329")
    public static final String ID_TAGTYPE = "id";

    @objid ("dd0516cf-d513-4934-a8ba-7fdcf73b8034")
    public static final String URI_TAGTYPE = "uri";

    /**
     * Tells whether a {@link MmsObject proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << MmsObject >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9656fe05-7de3-4df4-aaf5-f12516aafb38")
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

    @objid ("24a43c72-9011-4793-b6bc-070a0cf86f3d")
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
    @objid ("971c97b7-230f-40be-991a-aa4c7bc5ecda")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("01e8652f-da60-4a16-89d6-61e9b457db51")
    public String getId() {
        return this.elt.getTagValue(MmsObject.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'uri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a5c1f560-6f58-4856-b722-cfa1cb9a7223")
    public String getUri() {
        return this.elt.getTagValue(MmsObject.MdaTypes.URI_TAGTYPE_ELT);
    }

    @objid ("203e6682-5b2a-4641-ac0e-6b90dc43407d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4ae59005-6250-4934-b0b2-f78edc63e5b8")
    public void setId(final String value) {
        this.elt.putTagValue(MmsObject.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'uri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("786d688b-631f-4f60-8b7c-74282a444c24")
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

    @objid ("abc0ea39-e802-48a4-9605-a4adb35f06c6")
    protected MmsObject(final ModelElement elt) {
        super(elt);
    }

    @objid ("2f90ab01-c906-4902-9288-e931e22fb14d")
    public static final class MdaTypes {
        @objid ("988952fe-e8be-482d-8e94-e49b244afe71")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c0a6aebc-c0d0-454d-82d4-4d2c73a472f9")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("889aa78f-2201-47da-a246-46ec99b2186b")
        public static TagType URI_TAGTYPE_ELT;

        @objid ("f5e4f7ad-fe43-43aa-a6c8-78291e1ab102")
        private static Stereotype MDAASSOCDEP;

        @objid ("62f90337-3e0b-4b6f-8acf-d31f91d1524d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("160ce5d5-dc50-4cbf-affb-bd62706eedd2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "907f72a5-eb52-4908-953e-7f9a66b9939d");
            ID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a139c9cf-4b74-454a-b4cd-b0363a008c40");
            URI_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5cff0fda-7e85-46ea-af8b-de500c800a21");
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
