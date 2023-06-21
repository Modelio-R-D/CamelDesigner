/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("f3f6b0f0-e3e3-4dd5-b8dc-bab89385d124")
    public static final String STEREOTYPE_NAME = "Location";

    @objid ("a28c934a-2896-4bbb-a4ea-7dd302cb7b0a")
    public static final String ID_TAGTYPE = "id";

    /**
     * Tells whether a {@link Location proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << Location >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1acbe172-9152-4d3e-81dc-8b3cd15e39bb")
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

    @objid ("62994b3a-e2fb-4539-969d-29490a54f9a3")
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
    @objid ("085220cf-8f9d-46d3-b7ad-dad81ddcd3ad")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ff58836d-c9a7-4708-888f-413a36058d92")
    public String getId() {
        return this.elt.getTagValue(Location.MdaTypes.ID_TAGTYPE_ELT);
    }

    @objid ("8e672676-d7c8-4f72-b476-e106a0c2bc40")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8b8da20f-5a91-4abc-bad9-6fee9b9e9ca9")
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

    @objid ("10477b48-1df0-4b32-953e-e9914fb6f01f")
    protected Location(final Enumeration elt) {
        super(elt);
    }

    @objid ("a0bb5fe1-09b7-41e5-9811-6126f9ea7b6e")
    public static final class MdaTypes {
        @objid ("7efd986d-5fc9-4d05-b287-f1228d23e6db")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ae0a17eb-55e9-4694-a085-64efad170fb7")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("a2230c23-3fd9-4c40-8c09-28a231a06374")
        private static Stereotype MDAASSOCDEP;

        @objid ("972971f7-980c-4ed0-9f0e-94a2f2287bf2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("95663e28-54bb-4d98-9587-1aa4da164d27")
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
