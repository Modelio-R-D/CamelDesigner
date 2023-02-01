/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << LocationRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("74a3ed13-52f1-4d74-b05d-c1717fddaad8")
public class LocationRequirement extends HardRequirement {
<<<<<<< HEAD
    @objid ("b1db7c4d-4249-4bd8-95b0-5210e56e7e4d")
    public static final String STEREOTYPE_NAME = "LocationRequirement";

    @objid ("527d1b2e-4815-465f-88f3-442a346daadf")
=======
    @objid ("cf1e5890-4690-4d58-a778-15cc1c3ca744")
    public static final String STEREOTYPE_NAME = "LocationRequirement";

    @objid ("52a83ce6-4e5f-4c40-9e80-e9eac738efed")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String ALLREQUIRED_TAGTYPE = "allRequired";

    /**
     * Tells whether a {@link LocationRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << LocationRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("9d472d54-1455-4b2b-b36c-d5b02f6f1798")
=======
    @objid ("39de21b7-6caf-4f14-9a31-8aee8cb775da")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << LocationRequirement >> then instantiate a {@link LocationRequirement} proxy.
     * 
     * @return a {@link LocationRequirement} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("5e2ebbee-89d4-4da0-b29f-6a1a36fbc68e")
=======
    @objid ("4c902b2c-35fd-4e9c-9c19-a7247fa9b7fc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static LocationRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, LocationRequirement.STEREOTYPE_NAME);
        return LocationRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link LocationRequirement} proxy from a {@link Class} stereotyped << LocationRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link LocationRequirement} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("b0875db4-27a3-48fe-9755-909de123b309")
=======
    @objid ("af7793d8-4fdf-468c-91cc-a5f15fa3a718")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static LocationRequirement instantiate(final Class obj) {
        return LocationRequirement.canInstantiate(obj) ? new LocationRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link LocationRequirement} proxy from a {@link Class} stereotyped << LocationRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link LocationRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("f13c76ee-6e20-4885-8e02-e7214b4f4c54")
=======
    @objid ("fdb31370-a2d1-4f7d-abf7-e94b933f7934")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static LocationRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (LocationRequirement.canInstantiate(obj))
        	return new LocationRequirement(obj);
        else
        	throw new IllegalArgumentException("LocationRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'locations' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("e070afad-9703-49de-8201-e9084681c1ea")
=======
    @objid ("a1447d6d-8887-4295-a299-66dfe84d57d5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addLocations(final Location obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), LocationRequirement.MdaTypes.MDAASSOCDEP);
            d.setName("locations");
            d.putTagValue(LocationRequirement.MdaTypes.MDAASSOCDEP_ROLE, "locations");
        }
    }

<<<<<<< HEAD
    @objid ("16ceffcc-c090-4fa4-8b62-da1283025955")
=======
    @objid ("f7b230c9-a48e-4038-9379-5f468c7a7d5d")
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
        LocationRequirement other = (LocationRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("ac230989-0b9e-4675-9af1-24d4c68f440c")
=======
    @objid ("8190ab6f-8efd-403e-abd3-11840295cef1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'locations' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("607abc1b-53da-4a9a-8a21-56e39fd780ca")
=======
    @objid ("ded2689f-62b2-4787-bc22-e839d3fac001")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<Location> getLocations() {
        List<Location> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(LocationRequirement.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(LocationRequirement.MdaTypes.MDAASSOCDEP_ROLE), "locations")){
              if (CloudLocation.canInstantiate(d.getDependsOn()))
                results.add((CloudLocation)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CloudLocation.MdaTypes.STEREOTYPE_ELT.getName()));
              if (GeographicalRegion.canInstantiate(d.getDependsOn()))
                results.add((GeographicalRegion)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), GeographicalRegion.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("1c972f97-b38d-44f6-85cd-d1d26762a52d")
=======
    @objid ("faf84b85-4e15-4949-bca9-e8af238d8904")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'allRequired'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("f5d99960-332c-4242-b4d3-6f2b53315d6f")
=======
    @objid ("3d42e58d-183b-4135-9d2f-a4119951cce8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isAllRequired() {
        return this.elt.isTagged(LocationRequirement.MdaTypes.ALLREQUIRED_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'locations' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("76f30270-93b3-4d9b-90c2-3d0fff76143e")
=======
    @objid ("e26debc4-2ff2-4875-a610-f63ff6cf129c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeLocations(final Location obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(LocationRequirement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(LocationRequirement.MdaTypes.MDAASSOCDEP_ROLE), "locations")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for boolean property 'allRequired'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("1909a600-4785-4f5c-9194-55a68f6e187c")
=======
    @objid ("6c5d2bfe-1e48-42e4-8d8a-2690c002d83e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setAllRequired(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(LocationRequirement.MdaTypes.ALLREQUIRED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(LocationRequirement.MdaTypes.ALLREQUIRED_TAGTYPE_ELT);
    }

    @objid ("d2ba389f-3214-47da-ba0a-9dfed12a11ad")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("3210fb1e-2982-4efc-ac2a-e23c344ad78b")
=======
    @objid ("54e1f93c-eb9f-43e2-8c59-f1b300e9c613")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected LocationRequirement(final Class elt) {
        super(elt);
    }

    @objid ("6baddae1-dc4f-440f-a708-5529c6ec0aa5")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("d5c9df89-d55e-40b6-845d-38e8d85ce0c4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("96ce0412-f716-4c9b-901b-7093a4c8662d")
        public static TagType ALLREQUIRED_TAGTYPE_ELT;

        @objid ("1af93f17-4255-4419-9e59-5e75ca7c7df4")
        private static Stereotype MDAASSOCDEP;

        @objid ("8e0677ed-1570-480b-9eb0-86663d2196f3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("92b49c89-6385-42ab-9dc9-e2fbb9b9f8e0")
=======
        @objid ("3c5b07e5-f7ec-4022-affa-e86f56ddc5d9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7909a1d1-c4df-49af-8c19-53b73a2b65e5")
        public static TagType ALLREQUIRED_TAGTYPE_ELT;

        @objid ("b6deabeb-3f94-4c23-bd6f-d78236a0d8c6")
        private static Stereotype MDAASSOCDEP;

        @objid ("0b6eba8c-a330-4204-86f8-9475856a74dc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3bf44131-c43e-4334-b8bb-2c2a49399114")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "72da0f17-5434-4558-b50f-7be0430c3f2b");
            ALLREQUIRED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3af4908e-00c9-4466-8e0c-d74baa35afe1");
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
