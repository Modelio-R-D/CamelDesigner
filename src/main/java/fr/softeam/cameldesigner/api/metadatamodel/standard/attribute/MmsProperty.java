/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import camel.mms.MmsPropertyType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
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
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << MmsProperty >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e54ed6d9-ad78-40db-9d11-255a1e3c76fc")
public class MmsProperty extends MmsObject {
    @objid ("62badee8-92c6-469c-ba5b-3eb9cceda69f")
    public static final String STEREOTYPE_NAME = "MmsProperty";

    @objid ("634a8ddc-c25d-4582-91a0-5c23c37f81dd")
    public static final String PROPERTYTYPE_TAGTYPE = "propertyType";

    @objid ("46f13c51-b853-4b3d-bf97-74ed84b3f2bd")
    public static final String RANGEURI_TAGTYPE = "rangeUri";

    /**
     * Tells whether a {@link MmsProperty proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MmsProperty >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("72b91a9b-cc7d-4a23-9a37-69baae14ba24")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsProperty.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MmsProperty >> then instantiate a {@link MmsProperty} proxy.
     * 
     * @return a {@link MmsProperty} proxy on the created {@link Attribute}.
     */
    @objid ("9a061564-1416-4839-a261-1f8293ed63d5")
    public static MmsProperty create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MmsProperty.STEREOTYPE_NAME);
        return MmsProperty.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link MmsProperty} proxy from a {@link Attribute} stereotyped << MmsProperty >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link MmsProperty} proxy or <i>null</i>.
     */
    @objid ("425665f2-4449-45d2-b6bb-47ff1a7c38b7")
    public static MmsProperty instantiate(final Attribute obj) {
        return MmsProperty.canInstantiate(obj) ? new MmsProperty(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MmsProperty} proxy from a {@link Attribute} stereotyped << MmsProperty >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link MmsProperty} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5e471b52-91cc-4fc4-8b28-f797f26850a2")
    public static MmsProperty safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (MmsProperty.canInstantiate(obj))
        	return new MmsProperty(obj);
        else
        	throw new IllegalArgumentException("MmsProperty: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2d68ca69-23e5-42b0-9fd8-278f4b285066")
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
        MmsProperty other = (MmsProperty) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'domain' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bbf101ea-9505-4155-97c2-4aa0c3d7d267")
    public MmsConcept getDomain() {
        return (MmsConcept)CamelDesignerProxyFactory.instantiate(((Attribute) this.elt).getOwner(), MmsConcept.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("3525134c-4f20-45de-865a-5f610ef01e59")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'propertyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4ac6246c-3ddb-44e0-89d6-c9f695c91c36")
    public String getPropertyType() {
        return this.elt.getTagValue(MmsProperty.MdaTypes.PROPERTYTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'range' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8d0f5d06-5c6b-411e-a9d0-a33a599ce7e0")
    public MmsConcept getRange() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MmsProperty.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MmsProperty.MdaTypes.MDAASSOCDEP_ROLE), "range")){
                  if (MmsConcept.canInstantiate(d.getDependsOn()))
                     return (MmsConcept)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConcept.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'rangeUri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f08c2f60-1a85-44c4-b566-12bfafa8e5da")
    public String getRangeUri() {
        return this.elt.getTagValue(MmsProperty.MdaTypes.RANGEURI_TAGTYPE_ELT);
    }

    @objid ("f595ef97-8aed-4ddf-9cea-219ce345ed5e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'domain' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fa31fbb5-bee8-413a-b6b8-7b85df5645b4")
    public void setDomain(final MmsConcept obj) {
        ((Attribute) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Setter for string property 'propertyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("123e23c1-e6f7-464d-978a-9e04b9214dcc")
    public void setPropertyType(final String value) {
        this.elt.putTagValue(MmsProperty.MdaTypes.PROPERTYTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'range' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("58bbd27a-fe2a-4c2c-8b76-9154fe69dee7")
    public void setRange(final MmsConcept obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MmsProperty.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsProperty.MdaTypes.MDAASSOCDEP_ROLE), "range")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MmsProperty.MdaTypes.MDAASSOCDEP);
              dep.setName("range");      dep.putTagValue(MmsProperty.MdaTypes.MDAASSOCDEP_ROLE, "range");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'rangeUri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a2519009-87c5-436a-8d33-f0310d589ee9")
    public void setRangeUri(final String value) {
        this.elt.putTagValue(MmsProperty.MdaTypes.RANGEURI_TAGTYPE_ELT, value);
    }

    @objid ("fdb4c029-8359-4a6e-9bba-64967cc7977a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("54558d8a-f801-42e8-81a2-8532afe2bd0b")
    public MmsPropertyType getMmsPropertyType() {
        try {
            return MmsPropertyType.valueOf(this.elt.getTagValue(MmsProperty.MdaTypes.PROPERTYTYPE_TAGTYPE_ELT));
        }catch(Exception e) {
            //default value
            CamelDesignerModule.logService.info(e);
            return MmsPropertyType.DATA_PROPERTY;
        }
    }

    @objid ("d918f04b-f295-4457-8362-04b93c464a44")
    public void setMmsPropertyType(final MmsPropertyType value) {
        this.elt.putTagValue(MmsProperty.MdaTypes.PROPERTYTYPE_TAGTYPE_ELT, value.toString());
    }

    @objid ("944aa6cc-c137-440c-a59f-d586fe82421c")
    protected MmsProperty(final Attribute elt) {
        super(elt);
    }

    @objid ("37803f35-5e0b-4470-b34c-8406e4c82277")
    public static final class MdaTypes {
        @objid ("67e725dd-019a-4e86-b841-7c586881947e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1053c1b5-5e78-428c-aec0-3609c7d0844a")
        public static TagType RANGEURI_TAGTYPE_ELT;

        @objid ("d83ad6ba-b004-4f70-b764-2f0911f147b4")
        public static TagType PROPERTYTYPE_TAGTYPE_ELT;

        @objid ("5f2e5462-cf79-44ab-9fc0-67558582fbb2")
        private static Stereotype MDAASSOCDEP;

        @objid ("83ec381e-157c-4896-b6ed-e736a897e258")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6d7d2468-6729-436b-b0ce-e96dbe92daf5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2fd479fe-3531-4636-aba9-b8fb0976fe66");
            RANGEURI_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d51c3381-6675-4439-9ba0-f0c7da269bcf");
            PROPERTYTYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fb35b00c-ff5a-4b21-b9bf-fdb16ef500e5");
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
