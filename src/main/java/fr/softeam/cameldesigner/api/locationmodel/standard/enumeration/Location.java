/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.locationmodel.standard.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.enumeration.FeatureEnumeration;
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
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Enumeration} with << Location >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a6a4b7ae-60d0-494b-a18d-6990283999a7")
public abstract class Location extends FeatureEnumeration {
<<<<<<< HEAD
    @objid ("1479a682-7230-49ad-9766-391d47435f34")
    public static final String STEREOTYPE_NAME = "Location";

    @objid ("48281d52-c39b-4700-9a3a-de274d9754c6")
=======
    @objid ("cda48908-a949-4d6f-b9b8-f34ab77e314f")
    public static final String STEREOTYPE_NAME = "Location";

    @objid ("2b6aa57b-246c-4bfc-aaa0-0aed2333170d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String ID_TAGTYPE = "id";

    /**
     * Tells whether a {@link Location proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << Location >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("e22b867a-d88d-42d1-b632-53e74dae506a")
=======
    @objid ("f07aacbd-e080-4617-afc0-9b21bb72524c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Location.STEREOTYPE_NAME));
    }

    /**
     * Tries to instantiate a {@link Location} proxy from a {@link Enumeration} stereotyped << Location >> or << GeographicalRegion >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param enumeration a Enumeration
     * @return a {@link Location} proxy or <i>null</i>.
     */
    @objid ("7b872eee-d559-4eb7-992c-24240af62e5b")
    public static Location instantiate(final Enumeration enumeration) {
        if (CloudLocation.canInstantiate(enumeration))
            return new CloudLocation(enumeration);
        
        if (GeographicalRegion.canInstantiate(enumeration))
            return new GeographicalRegion(enumeration);
        return null;
    }

    /**
     * Tries to instantiate a {@link Location} proxy from a {@link Enumeration} stereotyped << Location >> or << GeographicalRegion >>checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Enumeration}
     * @return a {@link Location} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("84e8a941-195d-443d-8c17-8086b310c3d1")
    public static Location safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (CloudLocation.canInstantiate(obj))
            return new CloudLocation(obj);
        
        if (GeographicalRegion.canInstantiate(obj))
            return new GeographicalRegion(obj);
        
        throw new IllegalArgumentException("Location: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("a453af86-671c-4e8c-a95b-b56c22162e0e")
=======
    @objid ("e0b48c33-b928-4d2f-845b-8f67728b6d0e")
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
        Location other = (Location) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Enumeration}. 
     * @return the Enumeration represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("29f3b6a0-d250-404d-a9ce-5f0bac3df9b7")
=======
    @objid ("8e9b48de-3612-47a7-af06-4af2f27a8498")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("b1998f01-a904-432a-9bfc-3eeb05981cf4")
=======
    @objid ("6fc52180-13ab-42e5-9c17-3f7b9ef66787")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getId() {
        return this.elt.getTagValue(Location.MdaTypes.ID_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("ec6c3e0c-f7ff-4eb1-b752-377ce1b4fd75")
=======
    @objid ("1310ce24-a9d9-41c1-be6a-16e69531abf9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("df16d18e-672e-4426-bc19-aaed0aa7f40a")
=======
    @objid ("c9d2b8e4-0784-4463-9b65-5fe33f1c39b2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setId(final String value) {
        this.elt.putTagValue(Location.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    @objid ("2f685fd0-8f92-4030-b219-78d528bf236a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("74761afa-728d-4c6f-88f6-98e1fa091413")
=======
    @objid ("521bb427-2a3d-4a86-bd63-81e200e95fc9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Location(final Enumeration elt) {
        super(elt);
    }

    @objid ("a0bb5fe1-09b7-41e5-9811-6126f9ea7b6e")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("8f7d298f-59cf-4d95-bde7-c7624aa3a4cb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d203095b-099f-41b7-8692-a59a4175b143")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("fac74999-9fe0-48de-99fb-ec5ee1091fb1")
        private static Stereotype MDAASSOCDEP;

        @objid ("c8962163-fcb8-410e-8582-790f513a35d2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a569b4ef-ff95-451d-a586-db15efadec99")
=======
        @objid ("f27ff116-214e-4dff-8646-7f4b39b77ea8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8d0acffb-bed8-4322-92f4-7f80a5bd76ba")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("e45461a6-52db-41f0-8287-17e23b5999ca")
        private static Stereotype MDAASSOCDEP;

        @objid ("16c0457f-81ca-475e-a295-fbb4d87535de")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f2a74095-9abd-4c8f-94b1-864e5c63c8f3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "451ac0cf-b5d0-488a-8f05-43139794aa83");
            ID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4726ff4f-02ae-437f-aebc-16cda8f5d0df");
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
