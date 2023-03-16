/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("214b5b1d-1198-41f3-bef2-ea5652a56e41")
    public static final String STEREOTYPE_NAME = "Location";

    @objid ("6b91bb6f-f8ff-41fb-8b07-dbec96a44fe6")
    public static final String ID_TAGTYPE = "id";

    /**
     * Tells whether a {@link Location proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << Location >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("673a395b-4a7b-48ca-bc58-1957a028b5f0")
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

    @objid ("045c271b-06e5-461e-ba2a-95a392437ac1")
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
    @objid ("3fe523e9-6de9-43e5-8f79-377acae8a842")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cb977132-aedf-4ded-8d8a-9a4f3ab2c3ff")
    public String getId() {
        return this.elt.getTagValue(Location.MdaTypes.ID_TAGTYPE_ELT);
    }

    @objid ("cc66d819-8da6-411c-a05d-808e9975c55f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("70a079d9-c13e-4ee6-baa6-6fa584c5100d")
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

    @objid ("bd7c3171-11f1-4958-ad12-80a6485c38e1")
    protected Location(final Enumeration elt) {
        super(elt);
    }

    @objid ("a0bb5fe1-09b7-41e5-9811-6126f9ea7b6e")
    public static final class MdaTypes {
        @objid ("49c38b8e-f14f-4e1c-aa6f-ccd515ced155")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("043e595f-36b2-4d2b-85ab-90b6e2f87c9a")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("b4ee5acd-991a-40a3-a4f2-09e5a7c881ae")
        private static Stereotype MDAASSOCDEP;

        @objid ("e81e6f5e-8954-4cd1-8255-f798705343bd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a5c0b89b-fdfa-425d-88a2-a5cc513c1225")
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
