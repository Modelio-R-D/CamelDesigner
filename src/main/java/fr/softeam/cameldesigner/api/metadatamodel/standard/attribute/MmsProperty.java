/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("09f0b81d-a33c-423e-a394-a0c26ea732b8")
    public static final String STEREOTYPE_NAME = "MmsProperty";

    @objid ("f3702f52-e282-43a4-b420-f2082064052e")
    public static final String PROPERTYTYPE_TAGTYPE = "propertyType";

    @objid ("442d7644-4070-48c8-818e-e1e80ef8d488")
    public static final String RANGEURI_TAGTYPE = "rangeUri";

    /**
     * Tells whether a {@link MmsProperty proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MmsProperty >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("965435e6-4980-4123-a7c5-1a71db674f6a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsProperty.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MmsProperty >> then instantiate a {@link MmsProperty} proxy.
     * 
     * @return a {@link MmsProperty} proxy on the created {@link Attribute}.
     */
    @objid ("87dcbf2d-eadf-4a52-8156-5a98bec19041")
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
    @objid ("02e9f8c9-07b7-4907-bd35-87957786a774")
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
    @objid ("2e344461-46f6-4085-810e-b5c1f82bb114")
    public static MmsProperty safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (MmsProperty.canInstantiate(obj))
        	return new MmsProperty(obj);
        else
        	throw new IllegalArgumentException("MmsProperty: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0063bdfc-5d6a-4533-9460-0fac76028056")
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
    @objid ("58477784-6dbd-4130-81e4-8382801df069")
    public MmsConcept getDomain() {
        return (MmsConcept)CamelDesignerProxyFactory.instantiate(((Attribute) this.elt).getOwner(), MmsConcept.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("0d8662df-87dc-4a6d-a5ba-31998065045f")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'propertyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("822bbc25-a62a-4892-8a93-790edcee740a")
    public String getPropertyType() {
        return this.elt.getTagValue(MmsProperty.MdaTypes.PROPERTYTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'range' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("af6eaf47-1a1e-48f6-8878-db5ed4dc26d6")
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
    @objid ("9e1f1f83-ff60-4c0e-8cec-dfcb4e29edd7")
    public String getRangeUri() {
        return this.elt.getTagValue(MmsProperty.MdaTypes.RANGEURI_TAGTYPE_ELT);
    }

    @objid ("e793a0fa-8b00-4b52-939f-4653750d7c68")
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
    @objid ("cc17325b-2e6b-48db-b81c-6a0bda6aa351")
    public void setDomain(final MmsConcept obj) {
        ((Attribute) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Setter for string property 'propertyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("01a2839c-65c9-4a12-a5fe-e97b1b219ac9")
    public void setPropertyType(final String value) {
        this.elt.putTagValue(MmsProperty.MdaTypes.PROPERTYTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'range' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5cb578fb-098b-4f16-868f-cd4fc0df5a4c")
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
    @objid ("72c871e5-7677-430e-8f05-a36f6e51f517")
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
        return MmsPropertyType.valueOf(this.elt.getTagValue(MmsProperty.MdaTypes.PROPERTYTYPE_TAGTYPE_ELT));
    }

    @objid ("d918f04b-f295-4457-8362-04b93c464a44")
    public void setMmsPropertyType(final MmsPropertyType value) {
        this.elt.putTagValue(MmsProperty.MdaTypes.PROPERTYTYPE_TAGTYPE_ELT, value.toString());
    }

    @objid ("07fbc08e-021a-47ea-8339-50bf25bea810")
    protected MmsProperty(final Attribute elt) {
        super(elt);
    }

    @objid ("37803f35-5e0b-4470-b34c-8406e4c82277")
    public static final class MdaTypes {
        @objid ("c61c4ee1-6dd9-4700-b5a3-a93c3479d2bc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dab44b71-5ea0-4043-8243-404a0ee329b5")
        public static TagType RANGEURI_TAGTYPE_ELT;

        @objid ("c3fff7b6-6a87-415d-adb5-7b11456f1cc0")
        public static TagType PROPERTYTYPE_TAGTYPE_ELT;

        @objid ("f5be8f1f-f5e1-4a5f-8dd1-e1a928fd0ffa")
        private static Stereotype MDAASSOCDEP;

        @objid ("f8c6c100-caf4-4b10-9f96-3daab48c91a9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f10ad00e-36da-412f-aeac-6e895ec4f2d0")
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
