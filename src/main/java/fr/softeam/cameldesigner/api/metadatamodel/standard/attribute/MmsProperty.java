/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("07f611d7-316d-44eb-a729-0dd6482d5568")
    public static final String STEREOTYPE_NAME = "MmsProperty";

    @objid ("0f765446-2799-4f47-931a-0c781b4adf2d")
    public static final String PROPERTYTYPE_TAGTYPE = "propertyType";

    @objid ("714b7ed9-8f0b-4138-972c-e20c308ecb05")
=======
    @objid ("8468cd4c-9f06-41de-a342-3460ba31c96b")
    public static final String STEREOTYPE_NAME = "MmsProperty";

    @objid ("ffbcb6d5-db9f-446b-b9bd-ab6c55e7c0b2")
    public static final String PROPERTYTYPE_TAGTYPE = "propertyType";

    @objid ("0a33203f-dbbf-4e01-a9ae-015528021884")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String RANGEURI_TAGTYPE = "rangeUri";

    /**
     * Tells whether a {@link MmsProperty proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MmsProperty >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("48cc7a51-69c0-40e2-aef3-73b8f8179610")
=======
    @objid ("bebbc581-f284-4de5-970b-4fbebc2b3795")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsProperty.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MmsProperty >> then instantiate a {@link MmsProperty} proxy.
     * 
     * @return a {@link MmsProperty} proxy on the created {@link Attribute}.
     */
<<<<<<< HEAD
    @objid ("d7807090-4262-4b54-bb4e-52c25b8692e8")
=======
    @objid ("dd5fd32e-e22a-42c1-81c7-aa50705560e6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e9ee1560-9dc9-4e05-a610-91cfc6eb7509")
=======
    @objid ("0d5e65fe-435e-4450-a99b-c1a4369c6345")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("cd2772ec-9f5a-4615-ba4f-7dea71ee612e")
=======
    @objid ("3972100a-af11-4a36-a08e-13eec5f7a5b2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static MmsProperty safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (MmsProperty.canInstantiate(obj))
        	return new MmsProperty(obj);
        else
        	throw new IllegalArgumentException("MmsProperty: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("bcc48613-ae3b-4760-958d-1ea92c5bf51e")
=======
    @objid ("d876ff4a-413e-45b6-bd54-0e97b503c98c")
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
        MmsProperty other = (MmsProperty) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'domain' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("aff70a13-dcf9-44fc-80d4-75df298c37c2")
=======
    @objid ("d3267e0e-e59e-4210-86fc-a8f0eda75dc5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public MmsConcept getDomain() {
        return (MmsConcept)CamelDesignerProxyFactory.instantiate(((Attribute) this.elt).getOwner(), MmsConcept.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("2109affc-562a-4e30-bc0e-e0249c23883e")
=======
    @objid ("41bf52e5-8ad1-405d-ba5a-b5b634e2a0b3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'propertyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("d23bb46d-e92b-4182-ae78-10abaf23e92b")
=======
    @objid ("a51391f5-1f05-4a84-b9f6-9664eeadfb51")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getPropertyType() {
        return this.elt.getTagValue(MmsProperty.MdaTypes.PROPERTYTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'range' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("ddd889a6-1b62-4055-a7cc-342f2e6c9521")
=======
    @objid ("70ab3122-3dee-4d9a-87ee-1f3a5cf3d973")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("dc92701b-dc69-4f06-8579-7dd51b58d60f")
=======
    @objid ("7f58a5ea-961f-4488-be39-6cfe0d064e08")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getRangeUri() {
        return this.elt.getTagValue(MmsProperty.MdaTypes.RANGEURI_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("ccead380-13ca-4321-8974-57cca5655786")
=======
    @objid ("662f4fd3-cfdd-4115-b76f-53ff724a6b36")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("8051b098-aac3-41d7-85ab-56ae89d877d5")
=======
    @objid ("f3dd5a25-e705-47b7-8dfd-1be3b111bb70")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setDomain(final MmsConcept obj) {
        ((Attribute) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Setter for string property 'propertyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("b59900b6-bec2-4201-881a-38269e6b7def")
=======
    @objid ("2a18c1f7-c058-423f-a09c-ad37c8c71367")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setPropertyType(final String value) {
        this.elt.putTagValue(MmsProperty.MdaTypes.PROPERTYTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'range' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b3ccca6c-836a-46a0-a90d-f0f08c9c8f84")
=======
    @objid ("9e243190-beed-45e5-a087-d5c1e67c500a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("12efcc77-2f44-4674-ae92-aade5cdc8351")
=======
    @objid ("d3965247-8bec-402a-a2bf-b9a425eae1f3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("6b1927e9-26ca-46c6-893b-f20347c6afb0")
=======
    @objid ("900e8b2e-f498-4026-b1da-315595047884")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected MmsProperty(final Attribute elt) {
        super(elt);
    }

    @objid ("37803f35-5e0b-4470-b34c-8406e4c82277")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("0d796d80-32e9-4576-a34f-d1b4abd5ef1b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("11b1866d-693f-4df5-b260-386c2241d596")
        public static TagType RANGEURI_TAGTYPE_ELT;

        @objid ("8babbf50-b5e1-4171-9c0f-b93e9837f685")
        public static TagType PROPERTYTYPE_TAGTYPE_ELT;

        @objid ("3a4c45c4-9131-4a1d-83ac-71a406858e23")
        private static Stereotype MDAASSOCDEP;

        @objid ("ab2e11df-a91c-48ae-b406-ffd9a7134a6a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c6c8a701-3ee7-4b18-87c6-2a6aa9af1ae0")
=======
        @objid ("483457f0-f8c9-475d-9f15-f596cb25248f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("14116c02-e7ac-4143-979a-ac75f60a4235")
        public static TagType RANGEURI_TAGTYPE_ELT;

        @objid ("1b9d0aa6-5f3b-4c36-87bf-1fabd673a636")
        public static TagType PROPERTYTYPE_TAGTYPE_ELT;

        @objid ("c9da8ad4-3ffc-4493-85c8-074d03b6da24")
        private static Stereotype MDAASSOCDEP;

        @objid ("ab64cb5f-454f-4c46-b6f6-8cb0b6d23400")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7788236c-ba9a-41c1-8756-7cc6be720d9d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
