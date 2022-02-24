/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("f0f4ae17-6ba0-4ace-be7e-243c0da54694")
    public static final String STEREOTYPE_NAME = "Location";

    @objid ("7b275c4c-5947-41f8-9de2-06496b7f9dc8")
    public static final String ID_TAGTYPE = "id";

    /**
     * Tells whether a {@link Location proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << Location >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3fe32614-f7b0-4948-b25a-a733ddbf676e")
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

    @objid ("3eee9ff4-0488-4d19-9df1-22fd4357dfae")
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
    @objid ("10c206dd-221f-4d2e-a007-19b3dc3e8fc6")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("814fa7bb-c01b-4597-97e1-6f163900954d")
    public String getId() {
        return this.elt.getTagValue(Location.MdaTypes.ID_TAGTYPE_ELT);
    }

    @objid ("82239a0f-2546-4afe-b083-343cef7790f4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("93532a10-c51e-4109-8a3d-ff279c77b994")
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

    @objid ("4952a691-7316-4fde-a8b2-e2311ea10cb0")
    protected Location(final Enumeration elt) {
        super(elt);
    }

    @objid ("a0bb5fe1-09b7-41e5-9811-6126f9ea7b6e")
    public static final class MdaTypes {
        @objid ("6ac62d9e-1bcf-4215-9a6e-08893ec6d2e4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2b6156bf-ad85-4786-b1ce-a153bb2414ed")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("6171999e-d193-41d8-8d00-8987d70b877b")
        private static Stereotype MDAASSOCDEP;

        @objid ("4cf4fae1-e539-4d6c-b3a0-5cb5589667a0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("07867b5c-4441-42ab-a256-73aedb750851")
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
