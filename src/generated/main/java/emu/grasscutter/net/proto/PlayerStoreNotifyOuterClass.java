// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerStoreNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerStoreNotifyOuterClass {
  private PlayerStoreNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerStoreNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerStoreNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Item item_list = 15;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ItemOuterClass.Item> 
        getItemListList();
    /**
     * <code>repeated .Item item_list = 15;</code>
     */
    emu.grasscutter.net.proto.ItemOuterClass.Item getItemList(int index);
    /**
     * <code>repeated .Item item_list = 15;</code>
     */
    int getItemListCount();
    /**
     * <code>repeated .Item item_list = 15;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ItemOuterClass.ItemOrBuilder> 
        getItemListOrBuilderList();
    /**
     * <code>repeated .Item item_list = 15;</code>
     */
    emu.grasscutter.net.proto.ItemOuterClass.ItemOrBuilder getItemListOrBuilder(
        int index);

    /**
     * <code>uint32 weight_limit = 8;</code>
     * @return The weightLimit.
     */
    int getWeightLimit();

    /**
     * <code>.StoreType store_type = 2;</code>
     * @return The enum numeric value on the wire for storeType.
     */
    int getStoreTypeValue();
    /**
     * <code>.StoreType store_type = 2;</code>
     * @return The storeType.
     */
    emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType getStoreType();
  }
  /**
   * <pre>
   * CmdId: 672
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code PlayerStoreNotify}
   */
  public static final class PlayerStoreNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerStoreNotify)
      PlayerStoreNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerStoreNotify.newBuilder() to construct.
    private PlayerStoreNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerStoreNotify() {
      itemList_ = java.util.Collections.emptyList();
      storeType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerStoreNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerStoreNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 16: {
              int rawValue = input.readEnum();

              storeType_ = rawValue;
              break;
            }
            case 64: {

              weightLimit_ = input.readUInt32();
              break;
            }
            case 122: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                itemList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemOuterClass.Item>();
                mutable_bitField0_ |= 0x00000001;
              }
              itemList_.add(
                  input.readMessage(emu.grasscutter.net.proto.ItemOuterClass.Item.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          itemList_ = java.util.Collections.unmodifiableList(itemList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.internal_static_PlayerStoreNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.internal_static_PlayerStoreNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify.class, emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify.Builder.class);
    }

    public static final int ITEM_LIST_FIELD_NUMBER = 15;
    private java.util.List<emu.grasscutter.net.proto.ItemOuterClass.Item> itemList_;
    /**
     * <code>repeated .Item item_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ItemOuterClass.Item> getItemListList() {
      return itemList_;
    }
    /**
     * <code>repeated .Item item_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ItemOuterClass.ItemOrBuilder> 
        getItemListOrBuilderList() {
      return itemList_;
    }
    /**
     * <code>repeated .Item item_list = 15;</code>
     */
    @java.lang.Override
    public int getItemListCount() {
      return itemList_.size();
    }
    /**
     * <code>repeated .Item item_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemOuterClass.Item getItemList(int index) {
      return itemList_.get(index);
    }
    /**
     * <code>repeated .Item item_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemOuterClass.ItemOrBuilder getItemListOrBuilder(
        int index) {
      return itemList_.get(index);
    }

    public static final int WEIGHT_LIMIT_FIELD_NUMBER = 8;
    private int weightLimit_;
    /**
     * <code>uint32 weight_limit = 8;</code>
     * @return The weightLimit.
     */
    @java.lang.Override
    public int getWeightLimit() {
      return weightLimit_;
    }

    public static final int STORE_TYPE_FIELD_NUMBER = 2;
    private int storeType_;
    /**
     * <code>.StoreType store_type = 2;</code>
     * @return The enum numeric value on the wire for storeType.
     */
    @java.lang.Override public int getStoreTypeValue() {
      return storeType_;
    }
    /**
     * <code>.StoreType store_type = 2;</code>
     * @return The storeType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType getStoreType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType result = emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.valueOf(storeType_);
      return result == null ? emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (storeType_ != emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
        output.writeEnum(2, storeType_);
      }
      if (weightLimit_ != 0) {
        output.writeUInt32(8, weightLimit_);
      }
      for (int i = 0; i < itemList_.size(); i++) {
        output.writeMessage(15, itemList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (storeType_ != emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, storeType_);
      }
      if (weightLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, weightLimit_);
      }
      for (int i = 0; i < itemList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, itemList_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify other = (emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify) obj;

      if (!getItemListList()
          .equals(other.getItemListList())) return false;
      if (getWeightLimit()
          != other.getWeightLimit()) return false;
      if (storeType_ != other.storeType_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getItemListCount() > 0) {
        hash = (37 * hash) + ITEM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemListList().hashCode();
      }
      hash = (37 * hash) + WEIGHT_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getWeightLimit();
      hash = (37 * hash) + STORE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + storeType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 672
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code PlayerStoreNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerStoreNotify)
        emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.internal_static_PlayerStoreNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.internal_static_PlayerStoreNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify.class, emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getItemListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          itemListBuilder_.clear();
        }
        weightLimit_ = 0;

        storeType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.internal_static_PlayerStoreNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify build() {
        emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify result = new emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify(this);
        int from_bitField0_ = bitField0_;
        if (itemListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            itemList_ = java.util.Collections.unmodifiableList(itemList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.itemList_ = itemList_;
        } else {
          result.itemList_ = itemListBuilder_.build();
        }
        result.weightLimit_ = weightLimit_;
        result.storeType_ = storeType_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify.getDefaultInstance()) return this;
        if (itemListBuilder_ == null) {
          if (!other.itemList_.isEmpty()) {
            if (itemList_.isEmpty()) {
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureItemListIsMutable();
              itemList_.addAll(other.itemList_);
            }
            onChanged();
          }
        } else {
          if (!other.itemList_.isEmpty()) {
            if (itemListBuilder_.isEmpty()) {
              itemListBuilder_.dispose();
              itemListBuilder_ = null;
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              itemListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getItemListFieldBuilder() : null;
            } else {
              itemListBuilder_.addAllMessages(other.itemList_);
            }
          }
        }
        if (other.getWeightLimit() != 0) {
          setWeightLimit(other.getWeightLimit());
        }
        if (other.storeType_ != 0) {
          setStoreTypeValue(other.getStoreTypeValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.ItemOuterClass.Item> itemList_ =
        java.util.Collections.emptyList();
      private void ensureItemListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          itemList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemOuterClass.Item>(itemList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemOuterClass.Item, emu.grasscutter.net.proto.ItemOuterClass.Item.Builder, emu.grasscutter.net.proto.ItemOuterClass.ItemOrBuilder> itemListBuilder_;

      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemOuterClass.Item> getItemListList() {
        if (itemListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(itemList_);
        } else {
          return itemListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public int getItemListCount() {
        if (itemListBuilder_ == null) {
          return itemList_.size();
        } else {
          return itemListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemOuterClass.Item getItemList(int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);
        } else {
          return itemListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public Builder setItemList(
          int index, emu.grasscutter.net.proto.ItemOuterClass.Item value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.set(index, value);
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public Builder setItemList(
          int index, emu.grasscutter.net.proto.ItemOuterClass.Item.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public Builder addItemList(emu.grasscutter.net.proto.ItemOuterClass.Item value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public Builder addItemList(
          int index, emu.grasscutter.net.proto.ItemOuterClass.Item value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(index, value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public Builder addItemList(
          emu.grasscutter.net.proto.ItemOuterClass.Item.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public Builder addItemList(
          int index, emu.grasscutter.net.proto.ItemOuterClass.Item.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public Builder addAllItemList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ItemOuterClass.Item> values) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, itemList_);
          onChanged();
        } else {
          itemListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public Builder clearItemList() {
        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          itemListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public Builder removeItemList(int index) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.remove(index);
          onChanged();
        } else {
          itemListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemOuterClass.Item.Builder getItemListBuilder(
          int index) {
        return getItemListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemOuterClass.ItemOrBuilder getItemListOrBuilder(
          int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);  } else {
          return itemListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ItemOuterClass.ItemOrBuilder> 
           getItemListOrBuilderList() {
        if (itemListBuilder_ != null) {
          return itemListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(itemList_);
        }
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemOuterClass.Item.Builder addItemListBuilder() {
        return getItemListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ItemOuterClass.Item.getDefaultInstance());
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemOuterClass.Item.Builder addItemListBuilder(
          int index) {
        return getItemListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ItemOuterClass.Item.getDefaultInstance());
      }
      /**
       * <code>repeated .Item item_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemOuterClass.Item.Builder> 
           getItemListBuilderList() {
        return getItemListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemOuterClass.Item, emu.grasscutter.net.proto.ItemOuterClass.Item.Builder, emu.grasscutter.net.proto.ItemOuterClass.ItemOrBuilder> 
          getItemListFieldBuilder() {
        if (itemListBuilder_ == null) {
          itemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ItemOuterClass.Item, emu.grasscutter.net.proto.ItemOuterClass.Item.Builder, emu.grasscutter.net.proto.ItemOuterClass.ItemOrBuilder>(
                  itemList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          itemList_ = null;
        }
        return itemListBuilder_;
      }

      private int weightLimit_ ;
      /**
       * <code>uint32 weight_limit = 8;</code>
       * @return The weightLimit.
       */
      @java.lang.Override
      public int getWeightLimit() {
        return weightLimit_;
      }
      /**
       * <code>uint32 weight_limit = 8;</code>
       * @param value The weightLimit to set.
       * @return This builder for chaining.
       */
      public Builder setWeightLimit(int value) {
        
        weightLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 weight_limit = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeightLimit() {
        
        weightLimit_ = 0;
        onChanged();
        return this;
      }

      private int storeType_ = 0;
      /**
       * <code>.StoreType store_type = 2;</code>
       * @return The enum numeric value on the wire for storeType.
       */
      @java.lang.Override public int getStoreTypeValue() {
        return storeType_;
      }
      /**
       * <code>.StoreType store_type = 2;</code>
       * @param value The enum numeric value on the wire for storeType to set.
       * @return This builder for chaining.
       */
      public Builder setStoreTypeValue(int value) {
        
        storeType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.StoreType store_type = 2;</code>
       * @return The storeType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType getStoreType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType result = emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.valueOf(storeType_);
        return result == null ? emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
      }
      /**
       * <code>.StoreType store_type = 2;</code>
       * @param value The storeType to set.
       * @return This builder for chaining.
       */
      public Builder setStoreType(emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        storeType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.StoreType store_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearStoreType() {
        
        storeType_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PlayerStoreNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerStoreNotify)
    private static final emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify();
    }

    public static emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerStoreNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerStoreNotify>() {
      @java.lang.Override
      public PlayerStoreNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerStoreNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerStoreNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerStoreNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerStoreNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerStoreNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PlayerStoreNotify.proto\032\nItem.proto\032\017S" +
      "toreType.proto\"c\n\021PlayerStoreNotify\022\030\n\ti" +
      "tem_list\030\017 \003(\0132\005.Item\022\024\n\014weight_limit\030\010 " +
      "\001(\r\022\036\n\nstore_type\030\002 \001(\0162\n.StoreTypeB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ItemOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.StoreTypeOuterClass.getDescriptor(),
        });
    internal_static_PlayerStoreNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerStoreNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerStoreNotify_descriptor,
        new java.lang.String[] { "ItemList", "WeightLimit", "StoreType", });
    emu.grasscutter.net.proto.ItemOuterClass.getDescriptor();
    emu.grasscutter.net.proto.StoreTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
