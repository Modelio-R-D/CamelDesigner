/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("7775e141-7826-4bb1-889b-53cc52b964e8")
    public static final String STEREOTYPE_NAME = "MmsProperty";

    @objid ("989184a1-2091-4516-a6f4-354a4222ff65")
    public static final String PROPERTYTYPE_TAGTYPE = "propertyType";

    @objid ("afff7d7b-50d5-47f4-a25a-30178b3855dc")
    public static final String RANGEURI_TAGTYPE = "rangeUri";

    /**
     * Tells whether a {@link MmsProperty proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MmsProperty >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e5f0e013-2419-469a-9f4f-31f7ba8dc0e4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsProperty.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MmsProperty >> then instantiate a {@link MmsProperty} proxy.
     * 
     * @return a {@link MmsProperty} proxy on the created {@link Attribute}.
     */
    @objid ("805652b0-9af3-460c-9e0c-7dd3e99cdcbd")
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
    @objid ("a24b8fae-b3bf-4c7f-8168-2e7bbf2ed6bc")
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
    @objid ("30655767-1684-4595-a2a6-f40533d16ae7")
    public static MmsProperty safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (MmsProperty.canInstantiate(obj))
        	return new MmsProperty(obj);
        else
        	throw new IllegalArgumentException("MmsProperty: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c3189c65-0606-49a3-8429-0c067dfa92fb")
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
    @objid ("ca56016a-2086-44c2-a4c9-28ca7a921ea4")
    public MmsConcept getDomain() {
        return (MmsConcept)CamelDesignerProxyFactory.instantiate(((Attribute) this.elt).getOwner(), MmsConcept.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("1eca4e99-6e24-4615-9798-680365e94975")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'propertyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("10d4b331-cdd3-491a-a230-c69d2251bd85")
    public String getPropertyType() {
        return this.elt.getTagValue(MmsProperty.MdaTypes.PROPERTYTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'range' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("906f931e-d2ca-4074-9456-57135e844015")
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
    @objid ("8b0a306e-7797-488d-9e4d-87fb3035ffc4")
    public String getRangeUri() {
        return this.elt.getTagValue(MmsProperty.MdaTypes.RANGEURI_TAGTYPE_ELT);
    }

    @objid ("d25b76cb-8029-4654-9832-ed45cc5e0925")
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
    @objid ("120b7d47-95cf-4601-a890-751c7ff48298")
    public void setDomain(final MmsConcept obj) {
        ((Attribute) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Setter for string property 'propertyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("783c6f0d-ffba-4096-9c5b-7b65412243e8")
    public void setPropertyType(final String value) {
        this.elt.putTagValue(MmsProperty.MdaTypes.PROPERTYTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'range' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d8d7c7ae-9ac4-444f-8e42-06b8d0c8ccf4")
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
    @objid ("17fe0ca0-bb88-4e44-96f9-b64eccc2b512")
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

    @objid ("efe93e9e-db14-419f-9bd8-a20ce9fc1e47")
    protected MmsProperty(final Attribute elt) {
        super(elt);
    }

    @objid ("37803f35-5e0b-4470-b34c-8406e4c82277")
    public static final class MdaTypes {
        @objid ("e970d20a-7bb0-4584-b158-16ebee0759a2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5d18dd3b-96ad-453c-b51e-0c5c004c54ac")
        public static TagType RANGEURI_TAGTYPE_ELT;

        @objid ("95182041-14b7-48dc-b603-d62eec872017")
        public static TagType PROPERTYTYPE_TAGTYPE_ELT;

        @objid ("e7741280-d7b5-4433-b38e-756938cd99a3")
        private static Stereotype MDAASSOCDEP;

        @objid ("f2ccb6b1-1ed5-4f39-9bd1-8082be581391")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9d7f3ecd-4730-4807-9a1f-a97ab38c7065")
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
